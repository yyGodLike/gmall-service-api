package com.atguigu.bean;

import java.io.Serializable;

public class UserAddressVO implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer uid;
	
	private String name;
	
	private String phone;
	
	private String address;
	
	public UserAddressVO() {
		super();
	}

	public UserAddressVO(Integer uid, String name, String phone, String address) {
		super();
		this.uid = uid;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserAddressVO [uid=" + uid + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	
	
}
