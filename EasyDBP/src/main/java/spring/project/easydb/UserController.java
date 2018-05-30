package spring.project.easydb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserDAO userDao;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String userTest(){
		return "/user/login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView checkLogin(String id, String pw){
		ModelAndView mv = new ModelAndView();
		//userDao = service.checkLogin(id);
		if(userDao == null){
			System.out.println("해당 아이디 없음");
			String loginFailMsg = "해당 아이디 없음";
			mv.addObject("loginFailMsg", loginFailMsg);
			mv.setViewName("");
		}
		/*if(vo.getId().equalsIgnoreCase("hr") && vo.getPw().equals("hr")){
			mv.addObject("result", true);
		}
		else{
			mv.addObject("result", false);
		}
		mv.setViewName("loginresult");
		return mv;*/
		return null;
	}
	
	
	
}
