package com.studentManage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.studentManage.beans.Classes;
import com.studentManage.pojo.JsonReader;
import com.studentManage.pojo.PageModel;
import com.studentManage.service.IClassesService;

@Controller
@RequestMapping("/Classes")
public class ClassesController {
	@Autowired
	IClassesService classesService;
	@RequestMapping("/index")
	public String index(){
		return "classes";
	}
	@RequestMapping("/loadData")
	@ResponseBody
	public JsonReader<Classes> loadData(int page,int rows,String sidx,String sord,String keyword){
		PageModel<Classes> pageModel=classesService.getToPageModel(page, rows, null, null, sidx+" "+sord);
		JsonReader<Classes> jsonReader = new JsonReader<Classes>(pageModel,page,rows);
		return jsonReader;
	}
}
