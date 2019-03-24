package com.studentManage.beans;
import java.io.Serializable;
public class Classes   implements Serializable {
private Integer id;
	public Integer getId(){
		return this.id;
	}

	public void setId(Integer id){
		this.id=id;
	}

private String classname;
	public String getClassname(){
		return this.classname;
	}

	public void setClassname(String classname){
		this.classname=classname;
	}

	@Override
	public String toString() {
		return "classes [id=" +this.getId()+", classname=" +this.getClassname()+"]";}

}
