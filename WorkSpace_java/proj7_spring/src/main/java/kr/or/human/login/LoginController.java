package kr.or.human.login;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	// "loginForm.do"
//	@PostMapping("loginForm.do") url�� ���� �������� ���� �ű� ������ Get�� Post ��� ��� �Ǿ�� �ϹǷ�
	@RequestMapping("loginForm")
	public ModelAndView loginForm() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");

		mav.addObject("�α��� �� �ּ���.");

		return mav;
	}

	@RequestMapping("login")
	public ModelAndView login(HttpServletRequest req) {
		String userID = req.getParameter("userID");
		String userPW = req.getParameter("userPW");

		MemberDTO dto = new MemberDTO();
		dto.setUserID(userID);
		dto.setUserPW(userPW);

		System.out.println(dto);

		ModelAndView mav = new ModelAndView();
		mav.addObject("dto", dto);
		mav.setViewName("result");

		return mav;
	}

	@RequestMapping("login2")
	public ModelAndView login2(@RequestParam("userID") // �������ڸ� ���� �ʰ� ��������� �θ� 400������ Bad Request�� ���.
														// String userID = req.getParameter("userID"); �� ������ ����
														// parameter�� key�� �������� ���ٸ� ���� ����
														// required�� �⺻�� : true
	String userID,

			@RequestParam(value = "userPW", required = false) String userPW) {
//		String userID = req.getParameter("userID");
//		String userPW = req.getParameter("userPW");

		MemberDTO dto = new MemberDTO();
		dto.setUserID(userID);
		dto.setUserPW(userPW);

		System.out.println(dto);

		ModelAndView mav = new ModelAndView();
		mav.addObject("dto", dto);
		mav.setViewName("result");

		return mav;
	}

	@RequestMapping("/login3")
	public ModelAndView login3(
			// ���޹��� ��� ���� Map���� ��ȯ
			@RequestParam Map user

	) {

		String userID = (String) user.get("userID");
		String userPW = (String) user.get("userPW");

		MemberDTO dto = new MemberDTO();
		dto.setUserID(userID);
		dto.setUserPW(userPW);

		System.out.println(dto);

		ModelAndView mav = new ModelAndView();
		mav.addObject("dto", dto);
		mav.setViewName("result");

		return mav;
	}

	@RequestMapping("/login4")
	public ModelAndView login4(

//			@ModelAttribute : DTO�� �˾Ƽ� �־� ��
//			@ModelAttribute MemberDTO dto2

//			request�� "dto"��� key�� �ڵ��ϼ� �� MemberDTO�� �־� ��
//			@ModelAttribute("dto") 

//			request�� �� ���ڸ� �ҹ��ڷ� �ٲ� "memberDTO"��� key�� �־� ��
			MemberDTO dto2) {
		System.out.println(dto2);
//
		ModelAndView mav = new ModelAndView();
//		mav.addObject("dto", dto2);
		mav.setViewName("result");

		return mav;
	}

	@RequestMapping("/login5")
	public String login5(
			String userID,
			MemberDTO dto,
			Model model		//ModelAndView�� ��ü
			) {
		System.out.println("login5 ����");
		System.out.println("userID : " + userID);
		System.out.println(dto);
		model.addAttribute("userID", userID);
		
		return "result";
	}
	
	@RequestMapping("result")
	public void login6(MemberDTO dto) {
		// return type�� void
		// �Ǵ� return���� null �϶�
		// �ּ��� ������ "." ���� �ּҸ�
		// ViewResolver�� ����
		// �� �ּ�.jsp�� ȣ��
		
		// �׷��� �б� ���� ���������
		// return "result"; �� �ִ°� ����
		
	}

}
