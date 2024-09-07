package emp2.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import emp2.dto.EmpDTO;
import emp2.service.EmpService;

// 어노테이션
// "/login" 이 url로 요청시 이 서블릿을 호출 한다.
@WebServlet("/login")

// EmpLoginController 라는 클래스를 선언 ,HttpServlet이라는 기본 클래스를 상속
// HttpServlet : survlet의 기본 기능을 제공하는 클래스
// 즉 EmpLoginController는 HttpServlet의 모든 기능을 사용할 수 있게 됨
public class EmpLoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // id, pw를 받아서
    // db조회 후
    // 회원이면 list 페이지로
    // 아니면 로그인 페이지로
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            // 사용자가 로그인 폼에서 입력한 ID와 비밀번호를 요청 파라미터로부터 가져온다.
            // 'id'와 'pw'는 로그인 폼에서 사용자가 입력한 사용자 ID와 비밀번호의 이름
            String ename = request.getParameter("id");
            String empno = request.getParameter("pw");

            // 새로운 EmpDTO 객체를 생성한다.
            // EmpDTO는 사용자의 로그인 정보를 저장하는 데이터 전송 객체
            EmpDTO empDTO = new EmpDTO();
            
            // 가져온 사용자 ID를 EmpDTO 객체의 ename 속성에 설정
            empDTO.setEname(ename);

            // 가져온 비밀번호를 정수형으로 변환(Integer.parseInt)하여 EmpDTO 객체의 empno 속성에 설정(emp.DTO.setEmpno)
            empDTO.setEmpno(Integer.parseInt(empno));

            // 새로운 EmpService 객체를 생성
            // EmpService는 비즈니스 로직을 처리하는 서비스 클래스
            EmpService empService = new EmpService();
            
            // EmpDTO 객체를 사용하여 로그인 체크를 수행한다.
            // loginCheck 메서드는 사용자의 로그인 정보를 검증하고 결과를 반환
            EmpDTO resultDTO = empService.loginCheck(empDTO);

            // 로그인 체크 결과에 따라 적절한 페이지로 이동한다.
            // resultDTO가 null이 아니면 로그인 성공으로 간주하고 리스트 페이지로 리다이렉트
            // resultDTO가 null이면 로그인 실패로 간주하고 로그인 페이지로 포워딩
            if (resultDTO != null) {
                response.sendRedirect("list.jsp"); // 로그인 성공 시 리스트 페이지로 이동
            } else {
                request.setAttribute("errorMessage", "로그인 정보가 올바르지 않습니다."); // 로그인 실패 시 오류 메시지 설정
                request.getRequestDispatcher("/login.jsp").forward(request, response); // 로그인 페이지로 포워딩
            }

        } catch (Exception e) {
            // 예외가 발생하면 예외의 스택 트레이스를 출력하여 문제를 진단한다.
            e.printStackTrace();
            // 실제 애플리케이션에서는 적절한 예외 처리를 추가하여 사용자에게 오류 메시지를 제공할 수 있다.
        }
    }

    }

