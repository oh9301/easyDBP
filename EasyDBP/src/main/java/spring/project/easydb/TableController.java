package spring.project.easydb;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/db")
public class TableController {
	@Autowired
	SqlSession session;
	
	@Autowired
	EasyDBService service;
	
	@RequestMapping(value="/table", method=RequestMethod.GET)
	public String getTable() throws Exception{
		
		return "/db/tablemanage";
	}
	
	@RequestMapping(value="/table", method=RequestMethod.POST)
	public ModelAndView getTableSuccess() throws Exception
	{
		
		service.getTable("employees");
		ModelAndView mv =new ModelAndView();
		return mv;
	}
	
}
