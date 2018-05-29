package spring.project.easydb;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataDAO {
	
	@Autowired
	SqlSession session;
	
	
}
