package com.github.torlight.sbex;

public class PeopleDTO {
	
    private String phoneNumber;
    private String address;
    private String email;
    private User  user;
	
    public PeopleDTO() {
	
	}

	public PeopleDTO(String phoneNumber, String address, String email, User user) {
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
		this.user = user;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
    
}
