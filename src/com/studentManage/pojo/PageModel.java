package com.studentManage.pojo;

import java.util.ArrayList;
import java.util.List;

public class PageModel<T> {
	Integer rowCount;
	List<T> models = new ArrayList<T>();
	
	public Integer getRowCount() {
		return rowCount;
	}
	public void setRowCount(Integer rowCount) {
		this.rowCount = rowCount;
	}
	public List<T> getModels() {
		return models;
	}
	public void setModels(List<T> models) {
		this.models = models;
	}
	@Override
	public String toString() {
		return "PageModel [rowCount=" + rowCount + ", models=" + models + "]";
	}
	
}
