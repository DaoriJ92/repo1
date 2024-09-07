package emp2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import emp2.dto.EmpDTO;

public class EmpDAO {

    // 특정 사원(empno2)의 정보 또는 전체 사원 정보를 조회하는 메서드
    public List<EmpDTO> selectEmp(String empno2) {
        // 사원 정보를 담을 리스트를 생성
        List<EmpDTO> list = new ArrayList<>();

        try {
            // # DB에서 emp2 조회하기

            // ## DB 접속 시작
            // JNDI (Java Naming and Directory Interface)를 통해 DataSource 객체를 얻음
            Context ctx = new InitialContext();
            DataSource dataSource = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");

            // DataSource에서 커넥션을 가져옴
            Connection con = dataSource.getConnection();
            // ## DB 접속 끝

            // SQL 쿼리 준비
            String query;
            PreparedStatement ps;

            // empno2가 null이면 전체 사원 조회, 그렇지 않으면 특정 사원 조회
            if (empno2 == null) {
                query = "SELECT * FROM emp2";
            } else {
                query = "SELECT * FROM emp2 WHERE empno = ?";
            }
            ps = con.prepareStatement(query);

            // empno2가 null이 아닐 경우 쿼리의 파라미터 설정
            if (empno2 != null) {
                ps.setInt(1, Integer.parseInt(empno2));
            }

            // SQL 쿼리 실행 및 결과 확보
            ResultSet rs = ps.executeQuery();

            // 결과를 리스트에 추가
            while (rs.next()) {
                EmpDTO empDTO = new EmpDTO();
                // 현재 행에서 사원 정보를 읽어 DTO에 설정
                empDTO.setEmpno(rs.getInt("empno"));
                empDTO.setEname(rs.getString("ename"));
                empDTO.setJob(rs.getString("job"));
                empDTO.setHireDate(rs.getDate("hiredate"));

                // DTO를 리스트에 추가
                list.add(empDTO);
            }

            // 리소스 정리
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        // 사원 정보 리스트 반환
        return list;
    }

    // 사원 정보를 데이터베이스에 삽입하는 메서드
    public int insertEmp(EmpDTO dto) {
        int result = -1;

        try {
            // DB 접속
            Context ctx = new InitialContext();
            DataSource dataSource = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
            Connection con = dataSource.getConnection();

            // SQL 쿼리 준비
            String query = "INSERT INTO emp2 (empno, ename, sal, deptno, hiredate) VALUES (?, ?, ?, ?, sysdate)";
            // LoggableStatement를 사용하여 실행되는 SQL 쿼리를 로그로 출력할 수 있음
            PreparedStatement ps = new LoggableStatement(con, query);
            ps.setInt(1, dto.getEmpno());
            ps.setString(2, dto.getEname());
            ps.setInt(3, dto.getSal());
            ps.setInt(4, dto.getDeptno());

            // SQL 쿼리 로그 출력
            System.out.println(((LoggableStatement) ps).getQueryString());

            // SQL 실행
            result = ps.executeUpdate();

            // 리소스 정리
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        // 삽입 결과 반환 (성공 시 1, 실패 시 -1)
        return result;
    }

    // 로그인 기능을 수행하는 메서드
    public EmpDTO selectLogin(EmpDTO empDTO) {
        EmpDTO resultDTO = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // DB 접속
            Context ctx = new InitialContext();
            DataSource dataSource = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
            con = dataSource.getConnection();

            // SQL 쿼리 준비
            String query = "SELECT * FROM emp3 WHERE ename = ? AND empno = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, empDTO.getEname());
            ps.setInt(2, empDTO.getEmpno());

            // SQL 쿼리 실행 및 결과 확인
            rs = ps.executeQuery();

            // 결과를 DTO에 설정
            if (rs.next()) {
                resultDTO = new EmpDTO();
                resultDTO.setEmpno(rs.getInt("empno"));
                resultDTO.setEname(rs.getString("ename"));
                resultDTO.setSal(rs.getInt("sal"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 리소스 정리
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        // 로그인 결과 DTO 반환 (일치하는 사원 정보가 없으면 null 반환)
        return resultDTO;
    }
}
