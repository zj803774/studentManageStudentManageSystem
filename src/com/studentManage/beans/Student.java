package com.studentManage.beans;
import java.io.Serializable;
public class Student   implements Serializable {
private Integer id;
	public Integer getId(){
		return this.id;
	}

	public void setId(Integer id){
		this.id=id;
	}

private String name;
	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name=name;
	}

private String stunum;
	public String getStunum(){
		return this.stunum;
	}

	public void setStunum(String stunum){
		this.stunum=stunum;
	}

private String pwd;
	public String getPwd(){
		return this.pwd;
	}

	public void setPwd(String pwd){
		this.pwd=pwd;
	}

private String imgUrl;
	public String getImgUrl(){
		return this.imgUrl;
	}

	public void setImgUrl(String imgUrl){
		this.imgUrl=imgUrl;
	}

private Integer classid;
	public Integer getClassid(){
		return this.classid;
	}

	public void setClassid(Integer classid){
		this.classid=classid;
	}

private Integer sex;
	public Integer getSex(){
		return this.sex;
	}

	public void setSex(Integer sex){
		this.sex=sex;
	}

	@Override
	public String toString() {
		return "student [id=" +this.getId()+", name=" +this.getName()+", stunum=" +this.getStunum()+", pwd=" +this.getPwd()+", imgurl=" +this.getImgUrl()+", classid=" +this.getClassid()+", sex=" +this.getSex()+"]";}

}
