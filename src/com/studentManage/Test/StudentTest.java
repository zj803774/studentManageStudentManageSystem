package com.studentManage.Test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.studentManage.service.IStudentService;
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations={"classpath:applicationContext.xml"}) 
@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class StudentTest {
	@Autowired
	IStudentService studentService;
	/**
	 * 测试通过ID获得学生
	 */
	@Test
	public void deleteByIdTest(){
		boolean res = studentService.deleteById(1);
		System.out.println(res);
	}
}
