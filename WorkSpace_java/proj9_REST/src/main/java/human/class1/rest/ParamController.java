package human.class1.rest;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 클래스를 bean으로 등록시키면서 controller 역할을 줌
                  //bean id를 지정하지 않으면
                  // class명의 앞글자가 소문자인 bean id가 자동 지정됨.
                  // 그래서 지금은 "paramController"로 지정됨.
//@Controller("beanID") //bean id를 지정하는 방법
@ResponseBody // 이 class의 모든 메소드에 ResponseBody를 붙여줌 , viewresolver하지 않음
// @RestController // @Controller + @ ResponseBody
@RequestMapping("/human/a") // 주소 앞에 공통으로 적용
            // 이 주소로 클래스까지 들어옴 (HandlerMapping)
            // 그리고 나머지 주소로 메소드 찾아감 (HandlerAdaptor)
public class ParamController {

//   @Autowired // 이 타입의 변수에 넣을 수 있는
            // 동일한 클래스나
            // 자동 형 변환되는 클래스를 찾아서
            // 생성하고(IoC)
            // 변수에 넣어준다.(DI)
   
   //만약 후보 클래스가 2개 이상 있다면
   // @Primary가 붙은 클래스가 온다.
   // @Primary가 없다면
   // @QueriFier("bean id")로 특정 bean을 지정할 수 있다.
//   EmpService empService;
   
   @RequestMapping( // 각 값이 두개 이상인 경우 {}로 묶는다.
         value= {"/test","/test/{key}"}, //연결되는 주소
         method = {RequestMethod.GET, RequestMethod.PUT} // 허용하는 method
                                             // 없으면 모두 허용
         )
   
   @ResponseBody   //json또는 기본타입을 돌려줌.
   public EmpDTO paramTest(
         HttpServletRequest request,
         HttpServletRequest response,
         Model model,
         
         @RequestParam(value="id", required = true)String id,
         // String id= request.getParameter("id")에 해당
         // required는는 기본값이 true라서 생략하면 필수 전달인자가 됨 
         // 필수일때 null인 경우 400 Bad Request 발생
         
         // 파라메터의 key가 변수명과 동일하고 필수가 아닌 경우
         // @RequesParam 생략 가능
//         @RequestParam(value="pw", required = false)String pw
         String pw,
         
         @RequestParam Map map, // 모든 파라메터를 key, value로 map에 넣어 줌
         
         @ModelAttribute EmpDTO dto1, // getParameter로 꺼내서 field에 set 해 줌.
         @ModelAttribute("dto3") EmpDTO dto2,
         // 어차피 dto2를 model에 dto3라고 넣는 경우
         // (mode.addAttribute("dto3",dto2)를  한번에 처리 해 줌
         
         @ModelAttribute("empDTO") EmpDTO dto4,
         // model에 넣는 key를 class명의 앞 글자를 소문자로 하는 경우 @ModelAttribute의 생략이 가능
         EmpDTO dto5
         ) {
      
      return null;
   }

}