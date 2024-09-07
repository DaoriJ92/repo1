package emp2.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp2.service.EmpService;

@WebServlet("/emp")
public class EmpController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // HTTP GET 요청을 처리하는 메서드
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("/emp doGet 실행");

        // 클라이언트로부터 전달받은 'empno' 파라미터 값을 읽어옴
        // 예: URL이 /emp?empno=100인 경우 empno2는 "100"이 됨
        String empno2 = request.getParameter("empno");
        System.out.println("empno : " + empno2);

        // EmpService 객체를 생성하여 비즈니스 로직을 호출
        // EmpService는 데이터베이스에서 사원 정보를 조회하는 역할을 담당
        EmpService empService = new EmpService();
        // empno2가 null이면 전체 조회, 그렇지 않으면 특정 empno로 조회
        List<?> list = empService.getEmp(empno2);

        // 조회된 리스트를 request 객체의 속성으로 설정
        // request 객체는 클라이언트와 서버 간의 데이터 전송을 위한 저장소 역할을 함
        request.setAttribute("list", list);

        // JSP 페이지로 포워딩하여 결과를 클라이언트에게 반환
        // forward 방식은 request 객체를 JSP로 전달하므로, JSP에서 request.getAttribute("list")로 리스트를 접근할 수 있음
        request.getRequestDispatcher("/WEB-INF/views/empList.jsp").forward(request, response);
    }
}
