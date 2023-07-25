package com.customer;

public class Customer {

	private int id;
	private String name;
	private String  gender;
	private String phone_num;
	
	public Customer(int id, String name, String gender, String phone_num) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.phone_num = phone_num;
	}

	public Customer() {
		super();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", gender=" + gender + ", phone_num=" + phone_num + "]";
	}
	
	
	
	
}
