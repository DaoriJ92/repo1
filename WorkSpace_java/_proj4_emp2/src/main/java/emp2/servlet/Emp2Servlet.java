package emp2.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import emp2.dto.EmpDTO;

@WebServlet("/emp2")
public class Emp2Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("/emp2 doGet 실행");

        // 클라이언트로부터 전달받은 'empno' 파라미터 값을 읽어옴
        // 예: URL이 /emp2?empno=100인 경우 empno2는 "100"이 됨
        String empno2 = request.getParameter("empno");
        System.out.println("empno : "+ empno2);
        
        try {
            // # DB에서 emp2 조회하기
            
            // ## DB 접속 시작
            // JNDI (Java Naming and Directory Interface)를 통해 DataSource 객체를 얻음
            // DataSource는 데이터베이스 연결을 풀(pool)로 관리하여 효율적인 연결 관리를 가능하게 함
            Context ctx = new InitialContext();
            DataSource dataSource = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
            
            // DataSource에서 커넥션을 가져옴
            // 이 커넥션은 데이터베이스와의 실제 연결을 나타냄
            Connection con = dataSource.getConnection();
            // ## DB 접속 끝
            

            // SQL 쿼리 준비
            // SQL 쿼리를 조건에 따라 다르게 준비함
            String query = null;
            PreparedStatement ps = null;
            
            // empno 파라미터가 null이면 전체 조회, 그렇지 않으면 특정 empno로 조회
            // 파라미터가 null인 경우에는 전체 조회 쿼리 실행
            if(empno2 == null) {
                query = "SELECT * FROM emp2";
            } else {
                // empno 파라미터가 있는 경우, 해당 empno에 맞는 데이터만 조회
                query = "SELECT * FROM emp2 WHERE empno = ?";
            }
            
            // SQL 쿼리를 PreparedStatement 객체에 설정
            // PreparedStatement는 SQL 쿼리 실행에 사용되며, 쿼리 내의 파라미터를 안전하게 설정할 수 있음
            ps = con.prepareStatement(query);

            // empno 파라미터가 null이 아닐 경우 쿼리에 empno 값을 설정
            // empno 파라미터가 있는 경우, 해당 값을 쿼리의 파라미터로 설정
            if(empno2 != null) {
                ps.setInt(1, Integer.parseInt(empno2));
            }
            
            // 쿼리를 실행하여 결과를 ResultSet으로 가져옴
            // executeQuery() 메서드는 SELECT 쿼리 실행에 사용됨
            ResultSet rs = ps.executeQuery();
            
            // 결과를 List로 변환
            // ResultSet의 각 행을 DTO 객체로 변환하여 리스트에 추가
            List<EmpDTO> list = new ArrayList<>();
            // ResultSet의 각 행을 반복하여 DTO 객체로 변환
            // rs.next() 메서드는 ResultSet의 커서를 다음 행으로 이동시키며, 더 이상의 데이터가 없으면 false를 반환
            while (rs.next()) {
                EmpDTO empDTO = new EmpDTO();
                
                // 현재 행에서 empno 컬럼 값을 읽어 DTO에 설정
                int empno = rs.getInt("empno");
                empDTO.setEmpno(empno);
                
                // 현재 행에서 ename 컬럼 값을 읽어 DTO에 설정
                String ename = rs.getString("ename");
                empDTO.setEname(ename);
                
                // 현재 행에서 job, hiredate 컬럼 값을 읽어 DTO에 설정
                empDTO.setJob(rs.getString("job"));
                empDTO.setHireDate(rs.getDate("hiredate"));
                
                // DTO 객체를 리스트에 추가
                list.add(empDTO);
            }
            
            // List를 request 객체에 속성으로 설정하여 JSP로 전달
            // request.setAttribute() 메서드를 사용하여 데이터를 JSP에 전달
            request.setAttribute("list", list);
            
            // JSP로 포워딩하여 결과를 클라이언트에게 반환
            // getRequestDispatcher().forward() 메서드를 사용하여 요청과 응답을 JSP 페이지로 전달
            request
                .getRequestDispatcher("/WEB-INF/views/empList.jsp")
                .forward(request, response);
            
        } catch (Exception e) {
            // 예외가 발생하면 스택 트레이스를 출력
            // 에러 발생 시 디버깅을 위해 예외 정보를 출력
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // POST 요청에 대한 처리 로직이 필요하면 여기에 작성
        // 현재는 POST 요청에 대한 처리가 구현되어 있지 않음
    }

}
