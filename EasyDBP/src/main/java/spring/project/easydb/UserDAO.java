package spring.project.easydb;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDAO {
	
	@Autowired
	SqlSession session;
	
	public UserVO checkLogin (String id){
		return session.selectOne("dbcontrol.checkLogin", id);//id를 checkLogin으로 보내준다 --> sql-mapping.xml에서
	}
}
