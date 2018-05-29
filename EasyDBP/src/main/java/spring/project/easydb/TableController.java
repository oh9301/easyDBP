package spring.project.easydb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/db")
public class TableController {
	
	@Autowired
	TableDAO tableDao;
	
	
}
