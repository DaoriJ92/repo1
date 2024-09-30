package human.class1.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/human")
//@RestController = @Controller + @RequestBody 버전 문제로 사용 불가
public class RestController {
	
	@RequestMapping("/test1")
	public int test1() {
		return 100;
	}
	@RequestMapping("/test2")
	public int test2() {
		return 100;
	}

}
