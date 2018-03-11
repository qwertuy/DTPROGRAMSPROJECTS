package com.niit.Ecommerce_backend.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity	
@Table(name="USERMODEL")
public class UserModel implements Serializable
{
	private static final long serialVersionUID = 1L;
	// @Autowired
		/*private SessionFactory sessionFactory;*/
		
		/*public void setSessionFactory(SessionFactory sf){
			this.sessionFactory = sf;
		}*/
   
	@Id
	@Column(name="userid")//defining the database column
	private int userid;
	@Column(name="name")
	@NotEmpty(message="please enter the username")
	private String name;
	@Column(name="password")
	private String password;
	@Column(name="address")
	@NotEmpty(message="please enter the username")
	private String address;
	@Column(name="email")
	private String email;
	@Column(name="age")
	private int age;
	@Column(name="city")
	private String city;
	@Column(name="phone")
	
	private String phone;
	@Column(name="gender")
	private String gender;
	@Column(name="enabled")
	private boolean enabled;
	/*
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cartid") 
	private CartModel cartid;*/
	//fetch=FetchType.EAGER
	 
	 private String role;
	
	 public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public UserModel() {
			super();
		}
	public UserModel(int userid, String name, String password, String address, String email, int age, String city,
			String phone, String gender, boolean enabled, String role) {
		super();
		this.userid = userid;
		this.name = name;
		this.password = password;
		this.address = address;
		this.email = email;
		this.age = age;
		this.city = city;
		this.phone = phone;
		this.gender = gender;
		this.enabled = enabled;
		
		this.role = role;
	}
	//@Id
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}

