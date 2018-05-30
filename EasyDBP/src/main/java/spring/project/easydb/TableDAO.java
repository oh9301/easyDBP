package spring.project.easydb;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TableDAO {
	
	@Autowired
	SqlSession session;

	public void getTable(String tablename) throws Exception {
		// TODO Auto-generated method stub
			PreparedStatement pt = session.getConnection().prepareStatement("select * from " + tablename);
			
			ResultSet rs = pt.executeQuery();
			ResultSetMetaData meta = rs.getMetaData();
			int cnt = meta.getColumnCount();
			//cnt반복 /////
			System.out.println("cnt:"+cnt);
			
			for (int i = 0; i < cnt; i++) {
				System.out.println("컬럼네임:"+meta.getColumnName(i)+"타입네임:"+meta.getColumnTypeName(i)
				+"null종류:"+meta.isNullable(i));
			}
			
			List<TableVO> list=new ArrayList<TableVO>();
/*			for (int i = 0; i < cnt; i++) {
				list.add(index, element);
			}*/
			meta.getColumnName(1);
			meta.getColumnTypeName(1);
			int i = meta.isNullable(1);//0 1 
			/* vo 변수들
			 * List<String> name;
			 *  List<String> col_name;
			 *  List<String> null;
			 * */
			///////////////
		
		//return session.;
	}
}
