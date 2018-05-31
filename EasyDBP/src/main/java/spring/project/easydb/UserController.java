package spring.project.easydb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")//경로를 크게 하나 더 잡아줌
public class UserController {
	
	@Autowired
	UserDAO userDao;
	
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String userTest(){
		return "/user/login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView checkLogin(String id, String pw){
		//System.out.println("ㅁㅁㅁ");
		
		ModelAndView mv = new ModelAndView();
			UserVO userVo = userDao.checkLogin(id);
			String loginFailMsg = null;
			
		if(userVo == null){
			System.out.println("해당 아이디 없음");
			loginFailMsg = "해당 아이디 없음";
			mv.addObject("loginFailMsg", loginFailMsg);
			mv.setViewName("loginResult");
		}
			
		else if(userVo.getPw().equals(pw)){
			System.out.println("패스워드 일치");
			mv.addObject("userVo", userVo);
			//mv.setViewName("main");
		}
		
		else if(!userVo.getPw().equals(pw)){
			System.out.println("패스워드 불일치");
			 loginFailMsg = "패스워드불일치";
			 mv.addObject("loginFailMsg", loginFailMsg);
			mv.setViewName("loginResult");
		}
	
		return mv;
	}
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String userTest1(){
		return "/user/join";
	}
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String userTest2(){
		return "/user/join";
	}
	
	
	
}
