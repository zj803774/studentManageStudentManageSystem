package com.studentManage.mapper;

import java.util.List;
public interface IBaseDao<T> {

		/**
		 * 通过主键删除一条记录
		 * @param id
		 * @return
		 */
	    int deleteById(Object id);
	    int deleteByIds(List<Object> ids);
	    int deleteList(List<T> entities);
	    
	    int insert(T record);
	    int insertSelective(T record);
	    int insertList(List<T> records);
	    int insertSelectiveList(List<T> records);
	    
	    int updateByIdSelective(T record);
	    int updateById(T record);
	    int updateByList(List<T> records);
	    
	    
	    
	    T selectById(Object id);
	    T selectByWhere(String whereSql);
	    List<T> selectlist(java.util.Map<String, Object> sql);
		Integer getRowCount(java.util.Map<String, Object> sql);
}
