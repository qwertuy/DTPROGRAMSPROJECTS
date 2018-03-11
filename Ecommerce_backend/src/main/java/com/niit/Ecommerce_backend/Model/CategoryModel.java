package com.niit.Ecommerce_backend.Model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//Entity Mapped to the table
@Entity	
@Table(name="CategoryModel")
public class CategoryModel implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="categoryid")
	private int categoryid;
	@Column(name="categoryname")
	private String categoryname;
	 @OneToMany(targetEntity=ProductModel.class, mappedBy="categoryid", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
		@Column(name="setofproducts")
	private Set<ProductModel> setofproducts;
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public Set<ProductModel> getSetofproducts() {
		return setofproducts;
	}
	public void setSetofproducts(Set<ProductModel> setofproducts) {
		this.setofproducts = setofproducts;
	}
	public CategoryModel() {
		super();
	}
	public CategoryModel(int categoryid, String categoryname) {
		super();
		this.categoryid = categoryid;
		this.categoryname = categoryname;
	 
	 
	}
}
