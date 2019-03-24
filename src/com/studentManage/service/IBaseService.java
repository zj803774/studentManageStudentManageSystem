package com.studentManage.service;

import java.util.List;

import com.studentManage.pojo.PageModel;




public interface IBaseService<T> {
	
	
    boolean deleteById(Object id);
    boolean deleteByIds(List<Object> ids);
    boolean deleteList(List<T> entities);
    
    boolean save(T record);
    boolean saveSelective(T record);
    boolean saveList(List<T> records);
    boolean saveSelectiveList(List<T> records);
    
    boolean updateByIdSelective(T record);
    boolean updateById(T record);
    boolean updateByList(List<T> records);
    
    T getById(Object id);
    List<T> getList(Integer pageIndex,Integer pageSize,String selectFields,String whereSql,String orderBy);
	PageModel<T> getToPageModel(Integer pageIndex,Integer pageSize,String selectFields,String whereSql,String orderBy);
}
