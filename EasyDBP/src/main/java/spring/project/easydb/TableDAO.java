package spring.project.easydb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TableDAO {
	
	@Autowired
	SqlSession session;
	
	@Inject
	SqlSessionFactory sqlSessionFactory;

	public void getTable(String tablename) throws Exception {
		// TODO Auto-generated method stub
			SqlSession session2 = sqlSessionFactory.openSession();
			Connection con = session2.getConnection();
			PreparedStatement pt = con.prepareStatement("select * from " + tablename);
			
			ResultSet rs = pt.executeQuery();
			ResultSetMetaData meta = rs.getMetaData();
			int cnt = meta.getColumnCount();
			//cnt반복 /////
			System.out.println("cnt:"+cnt);
			
			for (int i = 1; i <= cnt; i++) {
				System.out.println("컬럼네임:"+meta.getColumnName(i)
				+"타입네임:"+meta.getColumnTypeName(i)
				+"null종류:"+meta.isNullable(i));
			}
			
			List<TableVO> list=new ArrayList<TableVO>();
			//list.add()
			ArrayList<String> columnNameList=new ArrayList<String>();
			ArrayList<String> columnValueList=new ArrayList<String>();
			ArrayList<String> columnTypeList=new ArrayList<String>();
			//TableVO vo=new TableVO();
			
/*			for (int i = 1; i <= cnt; i++) {
				columnNameList.add(meta.getColumnName(i));
				columnValueList.add(Integer.toString(meta.isNullable(i)));
				columnTypeList.add(meta.getColumnTypeName(i));	
				
				vo.setColumnNameList(columnNameList);
				vo.setColumnValueList(columnValueList);
				vo.setColumnTypeList(columnTypeList);
			}*/
			
			
			for (TableVO vo : list) {
				
				vo.setColumnNameList(columnNameList);
				for (int i = 0; i < cnt; i++) {
					vo.setTableName(tablename);
					columnNameList.add(meta.getColumnName(i));
					columnValueList.add(Integer.toString(meta.isNullable(i)));
					columnTypeList.add(meta.getColumnTypeName(i));	
					
					vo.setColumnNameList(columnNameList);
					vo.setColumnValueList(columnValueList);
					vo.setColumnTypeList(columnTypeList);
				
				}
				list.add(vo);
			}
			
			/* vo 변수들
			 * List<String> columnNameList; 속성명
			 *  List<String> columnValueList; 널인지 아닌지
			 *  List<String> columnTypeList; 타입 
			 * */
			///////////////
			con.close();
		//return session.;
	}
}
