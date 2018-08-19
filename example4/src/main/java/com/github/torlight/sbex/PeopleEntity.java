package com.github.torlight.sbex;

public class PeopleEntity {
    private Integer age;
    private String name;
    private String callNumber;
    private String address;
    private String email;
    
	public PeopleEntity() {
		
	}

	public PeopleEntity(Integer age, String name, String callNumber, String address, String email) {
		this.age = age;
		this.name = name;
		this.callNumber = callNumber;
		this.address = address;
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCallNumber() {
		return callNumber;
	}

	public void setCallNumber(String callNumber) {
		this.callNumber = callNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}   
