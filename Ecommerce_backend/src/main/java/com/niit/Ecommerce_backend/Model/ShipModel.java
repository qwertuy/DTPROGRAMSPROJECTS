package com.niit.Ecommerce_backend.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Entity	
@Table(name="SHIPMODEL")

public class ShipModel implements Serializable
{
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="cusid")
	private int cusid;
   	@Column(name="cusname")//defining the database column
	private String cusname;
	@Column(name="email")
	private String email;
	@Column(name="address")
	private String address;
	@Column(name="phone")
	private String phone;
	@Column(name="pay")
	private String pay;
	
	public int getCusid() {
		return cusid;
	}
	public void setCusid(int cusid) {
		this.cusid = cusid;
	}
	public String getCusname() {
		return cusname;
	}
	public void setCusname(String cusname) {
		this.cusname = cusname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPay() {
		return pay;
	}
	public void setPay(String pay) {
		this.pay = pay;
	}

	public ShipModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ShipModel(String cusname, String email, String address, String phone, String pay) {
		super();
		this.cusname = cusname;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.pay = pay;
	}
	
		
	}
	

