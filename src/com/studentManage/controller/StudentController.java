package com.studentManage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Student")
public class StudentController {
	@RequestMapping("/index")
	public String index(){
		return "student";
	}
}
