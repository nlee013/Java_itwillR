package com.naver;

public class NaverVO {

	private String id, name, pw1, pw2, email;
	private String gender, birth, tel;
	
	public NaverVO() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPw1() {
		return pw1;
	}

	public void setPw1(String pw1) {
		this.pw1 = pw1;
	}

	public String getPw2() {
		return pw2;
	}

	public void setPw2(String pw2) {
		this.pw2 = pw2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setGender(int gender) {
		
		if(gender == 1) {
			this.gender = "Female";
		}else {
			this.gender = "Male";
		}
	
	}
	
	public String getGender() {
		return gender;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		
		if(id == null || name == null) {
			return null;
		}
		String str = String.format("%6s %8s %6s %2s %8s %18s %13s", id, pw1, name, getGender(), birth, email, tel);
		
		return str;
	}
}
