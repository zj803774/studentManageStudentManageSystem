package com.studentManage.pojo;

import java.util.List;

/**
 * 服务器端返回的表格数据相对应
 * @author 张金
 *
 */
public class JsonReader<T> {
	/**
	 * 总页数
	 */
	public int total;
	/**
	 * 当前页
	 */
	public int page;
	/**
	 * 查询出的记录数
	 */
	public int records;
	/**
	 * 包含实际数据的数组
	 */
	public List<T> rows;
	
	public JsonReader() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JsonReader(int total, int page, int records, List<T> rows) {
		super();
		this.total = total;
		this.page = page;
		this.records = records;
		this.rows = rows;
	}
	public JsonReader(PageModel<T> pageModel,int pageIndex,int pageSize){
		this.records=pageModel.getRowCount();
		this.total=(records%pageSize==0)?(records/pageSize):(records/pageSize+1);
		this.page=pageIndex;
		this.rows = pageModel.getModels();
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRecords() {
		return records;
	}
	public void setRecords(int records) {
		this.records = records;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	@Override
	public String toString() {
		return "JsonReader [total=" + total + ", page=" + page + ", records=" + records + ", rows=" + rows + "]";
	}
	
}
