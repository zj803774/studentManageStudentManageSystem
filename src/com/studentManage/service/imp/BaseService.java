package com.studentManage.service.imp;

import java.util.List;

import com.studentManage.pojo.*;
import com.studentManage.mapper.IBaseDao;
import com.studentManage.service.IBaseService;


public  abstract class BaseService<T> implements IBaseService<T> {
	SelectMap sql=new SelectMap();
	public abstract  IBaseDao<T> getDao();
	@Override
	public boolean deleteById(Object id) {
		// TODO Auto-generated method stub
		return getDao().deleteById(id)==1;
		
	}

	@Override
	public boolean deleteByIds(List<Object> ids) {
		// TODO Auto-generated method stub
		return getDao().deleteByIds(ids)==ids.size();
	}

	@Override
	public boolean deleteList(List<T> entities) {
		// TODO Auto-generated method stub
		return getDao().deleteList(entities)==entities.size();
	}

	@Override
	public boolean save(T record) {
		// TODO Auto-generated method stub
		IBaseDao<T> dao = getDao();
		return dao.insert(record)==1;
	}

	@Override
	public boolean saveSelective(T record) {
		// TODO Auto-generated method stub
		return getDao().insertSelective(record)==1;
	}

	@Override
	public boolean saveList(List<T> records) {
		// TODO Auto-generated method stub
		return getDao().insertList(records)==records.size();
	}

	@Override
	public boolean saveSelectiveList(List<T> records) {
		// TODO Auto-generated method stub
		return getDao().insertSelectiveList(records)==1;
	}

	@Override
	public boolean updateByIdSelective(T record) {
		// TODO Auto-generated method stub
		return getDao().updateByIdSelective(record)==1;
	}

	@Override
	public boolean updateById(T record) {
		// TODO Auto-generated method stub
		return getDao().updateById(record)==1;
	}

	@Override
	public boolean updateByList(List<T> records) {
		// TODO Auto-generated method stub
		return getDao().updateByList(records)>0;
	}

	@Override
	public T getById(Object id) {
		// TODO Auto-generated method stub
		return getDao().selectById(id);
	}

	@Override
	public List<T> getList(Integer pageIndex, Integer pageSize, String selectFields, String whereSql,
			String orderBy) {
		// TODO Auto-generated method stub
		return getDao().selectlist(this.sql.createSql(pageIndex, pageSize, selectFields, whereSql, orderBy));
		
	}
	@Override
	public PageModel<T> getToPageModel(Integer pageIndex,Integer pageSize,String selectFields,String whereSql,String orderBy){
		PageModel<T> pageModel = new PageModel<T>();
		Integer  rowCount = getDao().getRowCount(this.sql.createSql(pageIndex, pageSize, selectFields, whereSql, orderBy));
		pageModel.setRowCount(rowCount);
		pageModel.setModels(getDao().selectlist(this.sql));
		return pageModel;
	}


}
