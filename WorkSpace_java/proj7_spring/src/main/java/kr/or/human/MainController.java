package kr.or.human;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

// Controller Bean (즉 spring이 생성 할 수 있는 Class) 으로 등록한다.
@Controller // ("mainContrller")가 생략 되어있다.(BeanName)
// ip:port/context_path/sub/** 
// class에 붙은 @RequestMapping은 HandlerMappinmg이 처리한다.
@RequestMapping("/sub")
public class MainController {

	// 메소드애 적용한 @RequestMapping은 HandlerAdaper가 처리한다.
	@RequestMapping("/main1.do")
	public ModelAndView main1() {
		System.out.println("main1 실행");

		// ViewResolver로 보내는 객체
		ModelAndView mav = new ModelAndView();
		// jsp의 조합을 위한 이름
		// forward로 이동 하게 됨
		mav.setViewName("main");

		// viewName을 생성자에 넣어도 됨
		// ModelAndView mav = new ModelAndView("main"); 생성과 동시에 적어도 실행 된다.
		return mav;
	}

	@RequestMapping("/main2.do")
	public ModelAndView main2() {
		System.out.println("main2 실행");

		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");

		mav.addObject("msg", "정다올");

		return mav;
	}

	// 전달인자가 value 하나 일 때는 value 라는 글씨를 생략 할 수있다.
	// 두개 이상의 값을 넣을때는 {} 안에 넣는다.
	// value는 url 패턴을 뜻 한다.
	// method는 접근 방식을 제한 함
	// 적은것 만 들어올 수 있음
	// method를 생략하면 모든 방식 허용
	@RequestMapping(value = { "/main/*/search", "/main3.do" }, method = { RequestMethod.POST, RequestMethod.GET } // doGet,
																													// doPost의
																													// 역할을
																													// 한다.
	)
	public ModelAndView main3() {
		System.out.println("main3 실행");

		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");

		// 마치 request.setAttribute처럼 담을 수 있는 방법
		mav.addObject("msg", "정다올");

		return mav;
	}

// 	url 패턴(주소)가 같으면 부팅시 예외 발생
//  그러나 method를 나눠서 Get과 Post를 지정 해 주면 접속 가능
//	@RequestMapping("/test/main2.do")
//	public ModelAndView main4() {
//		System.out.println("main4 실행");
//
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("main");
//
//		mav.addObject("msg", "정다올");
//
//		return mav;
//	}

	@RequestMapping(value = "/main5.do", method = RequestMethod.GET)
	public ModelAndView main5() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");

		mav.addObject("msg", "정다올");

		return mav;
	}

	@RequestMapping(value = "/main5.do", method = RequestMethod.POST)
	public ModelAndView main6() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");

		mav.addObject("msg", "정다올");

		return mav;
	}

//@RequestMapping(value = "/main5.do", method = RequestMethod.PUT)의 축약형
	@PutMapping("/test/main5.do")
	public ModelAndView main7() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");

		mav.addObject("msg", "뼈해장국 먹고싶어.");

		return mav;
	}

	// @RequestMapping(value = "/main8.do", method = RequestMethod.GET)의 축약형
	@GetMapping("/test/main5.do")
	public ModelAndView main8() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");

		mav.addObject("msg", "뼈해장국 먹고싶어.");

		return mav;
	}
	// @RequestMapping(value = "/main8.do", method = RequestMethod.POST)의 축약형
	@PostMapping("/test/main5.do")
	public ModelAndView main9() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");

		mav.addObject("msg", "뼈해장국 먹고싶어.");

		return mav;
	}
	// @RequestMapping(value = "/main8.do", method = RequestMethod.DELETE)의 축약형
	@DeleteMapping("/test/main5.do")
	public ModelAndView main10() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");

		mav.addObject("msg", "뼈해장국 먹고싶어.");

		return mav;
	}
}
