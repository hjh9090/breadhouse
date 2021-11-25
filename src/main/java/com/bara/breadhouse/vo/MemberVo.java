package com.bara.breadhouse.vo;



public class MemberVo {

	
	private String id;
	private String password;
	private String birthday;
	private String age;
	private String gender;
	private String email;
	
	
	public MemberVo() {
		super();
	}
	public MemberVo(String id, String password, String birthday, String age, String gender, String email) {
		super();
		this.id = id;
		this.password = password;
		this.birthday = birthday;
		this.age = age;
		this.gender = gender;
		this.email = email;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
