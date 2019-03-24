package com.studentManage.service.imp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.studentManage.mapper.IBaseDao;
import com.studentManage.mapper.ClassesMapper;
import com.studentManage.beans.Classes;
import com.studentManage.service.IClassesService;

@Service
public class ClassesService  extends BaseService<Classes> implements IClassesService {

	@Autowired
	private ClassesMapper dao;

	@Override
	public IBaseDao<Classes> getDao() {
		return dao;
	}

}
