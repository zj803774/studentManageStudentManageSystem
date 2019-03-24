package com.studentManage.service.imp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.studentManage.mapper.IBaseDao;
import com.studentManage.mapper.StudentMapper;
import com.studentManage.beans.Student;
import com.studentManage.service.IStudentService;

@Service
public class StudentService  extends BaseService<Student> implements IStudentService {

	@Autowired
	private StudentMapper dao;

	@Override
	public IBaseDao<Student> getDao() {
		return dao;
	}

}
