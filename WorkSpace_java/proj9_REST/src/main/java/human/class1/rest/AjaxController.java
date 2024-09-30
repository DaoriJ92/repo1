package human.class1.rest;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {

	/*
	 * 
	 * "/rest/ajax.ori" <<<<
	 * 
	 */

	@RequestMapping(value = "/ajax.view", method = RequestMethod.GET)
	public String ajaxView() {
		return "ajax";
	}

	@RequestMapping(value = "/ajax", method = RequestMethod.POST)
	public String ajax(

			@RequestParam(value = "ename", required = false) String ename, @ModelAttribute EmpDTO dto2,
			@RequestBody EmpDTO dto) {
		// json으로 보냈더니 @RequestParam 도는 request.getParameter로 받을 수 없다.
		System.out.println("ename : " + ename);
		System.out.println("dto : " + dto);
		System.out.println("dto2 : " + dto2);
		return "ajax";
	}

	@RequestMapping(value = "/ajax/string", method = RequestMethod.POST)

	@ResponseBody
	public String ajaxString(

			@RequestBody EmpDTO dto) {
		System.out.println("dto : " + dto);
		return "human";
	}

	@RequestMapping(value = "/ajax/dto", method = RequestMethod.POST)

	@ResponseBody
	public EmpDTO ajaxDto(

			@RequestBody EmpDTO dto) {
		System.out.println("dto : " + dto);

		return dto;
	}
	
	
	@RequestMapping(value = "/ajax/list", method = RequestMethod.POST)
	
	@ResponseBody
	public EmpDTO ajaxlist(
			
			@RequestBody EmpDTO dto) {
		System.out.println("dto : " + dto);
		
		List list = new ArrayList();
		list.add(dto);
		list.add(dto);
		list.add(dto);
		
		return dto;
	}
	
	@RequestMapping(value = "/ajax/forward", method = RequestMethod.GET)
	public String ajaxForward() {
		return "forward:/ajax.view";
	}
	
	@RequestMapping(value = "/ajax/redirect", method = RequestMethod.GET)
	public String ajaxRedirect() {
		return "redirect:/ajax.view";
	}
	
	@RequestMapping("/ajax/notice/{num}/static/{str}")
	@ResponseBody
	public int notice(
			@PathVariable("num")
			int num,
			@PathVariable("str")String str1,
			HttpServletRequest request
			) {
		System.out.println( "str1 : " +str1 ); 
		System.out.println( "num : " +num  ); 
		System.out.println( request.getParameter("num"));
		
		
		return num;
	}
}
