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
//	@PostMapping("loginForm.do") url을 통해 페이지로 들어가는 거기 떄문에 Get과 Post 모두 허용 되어야 하므로
	@RequestMapping("loginForm")
	public ModelAndView loginForm() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");

		mav.addObject("로그인 해 주세요.");

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
	public ModelAndView login2(@RequestParam("userID") // 전달인자를 적지 않고 빈공간으로 두면 400에러인 Bad Request가 뜬다.
														// String userID = req.getParameter("userID"); 와 동일한 동작
														// parameter의 key와 변수명이 같다면 생략 가능
														// required의 기본값 : true
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
			// 전달받은 모든 것을 Map으로 전환
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

//			@ModelAttribute : DTO에 알아서 넣어 줌
//			@ModelAttribute MemberDTO dto2

//			request에 "dto"라는 key로 자동완성 된 MemberDTO를 넣어 줌
//			@ModelAttribute("dto") 

//			request에 앞 글자만 소문자로 바꾼 "memberDTO"라는 key로 넣어 줌
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
			Model model		//ModelAndView를 대체
			) {
		System.out.println("login5 실행");
		System.out.println("userID : " + userID);
		System.out.println(dto);
		model.addAttribute("userID", userID);
		
		return "result";
	}
	
	@RequestMapping("result")
	public void login6(MemberDTO dto) {
		// return type이 void
		// 또는 return값이 null 일때
		// 주소의 마지막 "." 앞의 주소를
		// ViewResolver로 보냄
		// 즉 주소.jsp가 호출
		
		// 그래도 읽기 좋게 명시적으로
		// return "result"; 해 주는게 좋다
		
	}

}
