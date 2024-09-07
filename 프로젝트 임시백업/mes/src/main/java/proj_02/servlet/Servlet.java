package proj_02.servlet;

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

import proj_02.dto.Proj_02DTO;

@WebServlet("/mes")
public class Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("/proj_02 doGet 실행");

        try {
            // # DB에서 proj_02 조회

            // ## DB 접속 시작
            // JNDI 방식
            // Servers 폴더의 context.xml 중 Resource 태그(노드)를 가져온다
            // 그 곳에 있는 DB정보로 DataSource를 만든다
            // DataSource가 커넥션 풀 이라고 생각 하면 된다.
            Context ctx = new InitialContext();
            DataSource dataSource = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
            // 커넥션 풀에서 접속 정보를 가져오기
            Connection con = dataSource.getConnection();
            // ## DB 접속 끝

            // SQL 준비
            String query = "SELECT * FROM proj02_mr";
            PreparedStatement ps = con.prepareStatement(query);

            // SQL 실행 및 결과 확보
            // executeQuery : select문 실행
            // ResultSet : select문 조회 결과 전체 : 엑셀처럼 2차원 배열(그리드)
            ResultSet rs = ps.executeQuery();

            // 결과 활용
            // 각각의 줄을 DTO에 넣기
            // 만들어진 DTO를 List에 넣기

            List list = new ArrayList();
            // rs.next() : 다음 줄로 커서를 이동 한다.
            // 다음 줄이 있다면 true를 , 그렇지 않다면 false를 돌려줌
            // 다음 줄이 있으면 rs는 다음 줄 덩어리 : table의 tr 한 줄, 1차원 배열
            while (rs.next()) {
                Proj_02DTO proj02dto = new Proj_02DTO();
                // 이번 줄에서 equipment_number 값을 String으로 형 변환 해서 가져 옴
                proj02dto.setEquipment_number(rs.getString("equipment_number"));
                proj02dto.setEquipment_code(rs.getString("equipment_code"));
                proj02dto.setFault_code(rs.getString("fault_code"));
                proj02dto.setEquipment_name(rs.getString("equipment_name"));
                proj02dto.setRepair_company(rs.getString("repair_company"));
                proj02dto.setRepairer(rs.getString("repairer"));
                proj02dto.setLocation(rs.getString("location"));
                proj02dto.setManager(rs.getString("manager"));
                proj02dto.setRepair_date(rs.getDate("repair_date"));
                proj02dto.setRemarks(rs.getString("remarks"));

                // DTO를 리스트에 추가
                list.add(proj02dto);
            }

            // JSP로 보여주기 위해 request에 데이터를 세팅
            request.setAttribute("proj02List", list);
            // request를 JSP로 forward 방식으로 보내줌
            // 그래서 list를 request에 넣은 것
            request
            	.getRequestDispatcher("/WEB-INF/views/proj_02List.jsp")
            	.forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
