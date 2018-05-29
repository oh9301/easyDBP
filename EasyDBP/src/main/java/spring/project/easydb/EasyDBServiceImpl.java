package spring.project.easydb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EasyDBServiceImpl implements EasyDBService {
	
	@Autowired
	UserDAO userDao;
	@Autowired
	TableDAO tableDao;
	@Autowired
	DataDAO dataDao;
	
}
