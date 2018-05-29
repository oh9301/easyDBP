package spring.project.easydb;

import java.util.ArrayList;

public class TableVO {
	
	String tableName;
	ArrayList<String> columnNameList;
	ArrayList<String> columnValueList;
	ArrayList<String> columnTypeList;
	
	public TableVO(String tableName, ArrayList<String> columnNameList, ArrayList<String> columnValueList,
			ArrayList<String> columnTypeList) {
		this.tableName = tableName;
		this.columnNameList = columnNameList;
		this.columnValueList = columnValueList;
		this.columnTypeList = columnTypeList;
	}

	public TableVO(String tableName, ArrayList<String> columnNameList, ArrayList<String> columnTypeList) {
		this.tableName = tableName;
		this.columnNameList = columnNameList;
		this.columnTypeList = columnTypeList;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public ArrayList<String> getColumnNameList() {
		return columnNameList;
	}

	public void setColumnNameList(ArrayList<String> columnNameList) {
		this.columnNameList = columnNameList;
	}

	public ArrayList<String> getColumnValueList() {
		return columnValueList;
	}

	public void setColumnValueList(ArrayList<String> columnValueList) {
		this.columnValueList = columnValueList;
	}

	public ArrayList<String> getColumnTypeList() {
		return columnTypeList;
	}

	public void setColumnTypeList(ArrayList<String> columnTypeList) {
		this.columnTypeList = columnTypeList;
	}
	
	
}
