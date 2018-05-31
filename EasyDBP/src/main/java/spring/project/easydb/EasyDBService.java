package spring.project.easydb;

import java.util.List;

public interface EasyDBService {
	public void getTable(String tablename) throws Exception;
	public UserVO checkLogin(String id);
	
}
