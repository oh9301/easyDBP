package spring.project.easydb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/db")
public class DataController {
	
	@Autowired
	DataDAO dataDao;
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public void userTest(){
		
	}
}
