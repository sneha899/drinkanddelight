package com.cg.ddms.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="products_tbl")
public class Products {
	@Id
	@GeneratedValue(generator="mygen",strategy=GenerationType.SEQUENCE)
	@Column(name="productId")
	private int productId;
	
	@Column(name="pName")
	private String pName;
	
	@Column(name="price")
	private double price;
	
	@ManyToOne
	@JoinColumn(name="orderId")
	@JsonIgnore
	private ProductOrder products;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Products(int productId, String pName, double price) {
		super();
		this.productId = productId;
		this.pName = pName;
		this.price = price;
	}
	public Products() {
		super();
	}
	@Override
	public String toString() {
		return "Products [productId=" + productId + ", pName=" + pName + ", price=" + price + "]";
	}
	
	
	

}
