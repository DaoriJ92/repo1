package kr.or.human;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

// Controller Bean (�� spring�� ���� �� �� �ִ� Class) ���� ����Ѵ�.
@Controller // ("mainContrller")�� ���� �Ǿ��ִ�.(BeanName)
// ip:port/context_path/sub/** 
// class�� ���� @RequestMapping�� HandlerMappinmg�� ó���Ѵ�.
@RequestMapping("/sub")
public class MainController {

	// �޼ҵ�� ������ @RequestMapping�� HandlerAdaper�� ó���Ѵ�.
	@RequestMapping("/main1.do")
	public ModelAndView main1() {
		System.out.println("main1 ����");

		// ViewResolver�� ������ ��ü
		ModelAndView mav = new ModelAndView();
		// jsp�� ������ ���� �̸�
		// forward�� �̵� �ϰ� ��
		mav.setViewName("main");

		// viewName�� �����ڿ� �־ ��
		// ModelAndView mav = new ModelAndView("main"); ������ ���ÿ� ��� ���� �ȴ�.
		return mav;
	}

	@RequestMapping("/main2.do")
	public ModelAndView main2() {
		System.out.println("main2 ����");

		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");

		mav.addObject("msg", "���ٿ�");

		return mav;
	}

	// �������ڰ� value �ϳ� �� ���� value ��� �۾��� ���� �� ���ִ�.
	// �ΰ� �̻��� ���� �������� {} �ȿ� �ִ´�.
	// value�� url ������ �� �Ѵ�.
	// method�� ���� ����� ���� ��
	// ������ �� ���� �� ����
	// method�� �����ϸ� ��� ��� ���
	@RequestMapping(value = { "/main/*/search", "/main3.do" }, method = { RequestMethod.POST, RequestMethod.GET } // doGet,
																													// doPost��
																													// ������
																													// �Ѵ�.
	)
	public ModelAndView main3() {
		System.out.println("main3 ����");

		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");

		// ��ġ request.setAttributeó�� ���� �� �ִ� ���
		mav.addObject("msg", "���ٿ�");

		return mav;
	}

// 	url ����(�ּ�)�� ������ ���ý� ���� �߻�
//  �׷��� method�� ������ Get�� Post�� ���� �� �ָ� ���� ����
//	@RequestMapping("/test/main2.do")
//	public ModelAndView main4() {
//		System.out.println("main4 ����");
//
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("main");
//
//		mav.addObject("msg", "���ٿ�");
//
//		return mav;
//	}

	@RequestMapping(value = "/main5.do", method = RequestMethod.GET)
	public ModelAndView main5() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");

		mav.addObject("msg", "���ٿ�");

		return mav;
	}

	@RequestMapping(value = "/main5.do", method = RequestMethod.POST)
	public ModelAndView main6() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");

		mav.addObject("msg", "���ٿ�");

		return mav;
	}

//@RequestMapping(value = "/main5.do", method = RequestMethod.PUT)�� �����
	@PutMapping("/test/main5.do")
	public ModelAndView main7() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");

		mav.addObject("msg", "�����屹 �԰�;�.");

		return mav;
	}

	// @RequestMapping(value = "/main8.do", method = RequestMethod.GET)�� �����
	@GetMapping("/test/main5.do")
	public ModelAndView main8() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");

		mav.addObject("msg", "�����屹 �԰�;�.");

		return mav;
	}
	// @RequestMapping(value = "/main8.do", method = RequestMethod.POST)�� �����
	@PostMapping("/test/main5.do")
	public ModelAndView main9() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");

		mav.addObject("msg", "�����屹 �԰�;�.");

		return mav;
	}
	// @RequestMapping(value = "/main8.do", method = RequestMethod.DELETE)�� �����
	@DeleteMapping("/test/main5.do")
	public ModelAndView main10() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");

		mav.addObject("msg", "�����屹 �԰�;�.");

		return mav;
	}
}
