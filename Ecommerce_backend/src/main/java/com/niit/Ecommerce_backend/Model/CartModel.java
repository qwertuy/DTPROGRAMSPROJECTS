package com.niit.Ecommerce_backend.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity	
@Table(name="CARTMODEL")
public class CartModel implements Serializable
{

	
		
		private static final long serialVersionUID = 1L;
		@Id
	     private int cartid;
		//private int suplierid;
		//private int productid;
		//private int userid;
		private ProductModel productid;
	//	private SupplierModel suplierid;
		//private UserModel userid;
		
		private int prices;
		private int quantity;
		//private String status;
		
		@Id
		@GeneratedValue
		@Column(name="cartid")//defining the database column
		public int getCartid() {
			return cartid;
		}
		public void setCartid(int cartid) {
			this.cartid = cartid;
		}
		//In One productid display in cart
			@OneToOne
			@JoinColumn(name="productid")
			public ProductModel getProductid() {
				return productid;
			}
			public void setProductid(ProductModel productid) {
				this.productid = productid;
			}
			/*@OneToOne
			@JoinColumn(name="suplierid")
			public SupplierModel getSuplierid() {
				return suplierid;
			}
			public void setSuplierid(SupplierModel suplierid) {
				this.suplierid = suplierid;
			}*/
			/*@OneToOne
			@JoinColumn(name="userid")
			public UserModel getUserid() {
				return userid;
			}
			public void setUserid(UserModel userid) {
				this.userid = userid;
			}*/
		@Column(name="prices")
		public int getPrices() {
			return prices;
		}
		public void setPrices(int prices) {
			this.prices = prices;
		}
		@Column(name="quantity")
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		/*@Column(name="status")
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}*/
		
		
		

}

