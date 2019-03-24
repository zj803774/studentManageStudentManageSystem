package com.studentManage.pojo;

import java.util.HashMap;

public class SelectMap extends HashMap<String, Object> {
	private Integer pageIndex;
	private Integer pageSize;
	private String selectFields;
	private String whereSql;
	private String orderBy;
	
	public SelectMap createSql(Integer pageIndex,Integer pageSize,String selectFields,String whereSql,String orderBy){
		this.init();
		if(pageSize!=null && pageSize!=Integer.MAX_VALUE ){
			this.put("pageSize", pageSize);
			if(pageIndex >= 1){
				this.put("pageIndex", pageSize*(pageIndex-1));
			}else{
				this.put("pageIndex", 1);
			}
		}
		
		if(selectFields != null && !"".equals(selectFields.trim())){
			this.put("selectFields", selectFields);
		}
		
		if(whereSql != null && !"".equals(whereSql.trim())){
			String where =  " WHERE "+whereSql;
			this.put("whereSql",where);
		}
		
		if(orderBy != null && !"".equals(orderBy.trim())){
			String order = " ORDER BY "+orderBy;
			this.put("orderBy", order.replace("'", "''"));
		}
		return this;
	}
	
	public void init(){
		this.put("pageIndex", this.pageIndex);
		this.put("pageSize", this.pageSize);
		this.put("selectFields", this.selectFields);
		this.put("whereSql", this.whereSql);
		this.put("orderBy", this.orderBy);
	}
}
