package com.cg.ddms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productOrder_tbl")
public class ProductOrder {
	@Id
	@GeneratedValue(generator="mygen",strategy=GenerationType.SEQUENCE)
	@Column(name="orderId")
	private String orderId;
	
	@Column(name="productName")
	private String productName;
	
	@Column(name="productPrice")
    private double productPrice;
	
	@Column(name="productDeliveryDate")
	private Date productDeliveryDate;
	
	@Column(name="productQualityCheck")
	private String productQualityCheck;
	
	@Column(name="productprocessDate")
	private Date productprocessDate;
	
	private List<Products> product=new ArrayList<>();

	public ProductOrder(String orderId, String productName, double productPrice, Date productDeliveryDate,
			String productQualityCheck, Date productprocessDate, List<Products> product) {
		super();
		this.orderId = orderId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDeliveryDate = productDeliveryDate;
		this.productQualityCheck = productQualityCheck;
		this.productprocessDate = productprocessDate;
		this.product = product;
	}

	public ProductOrder() {
		super();
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public Date getProductDeliveryDate() {
		return productDeliveryDate;
	}

	public void setProductDeliveryDate(Date productDeliveryDate) {
		this.productDeliveryDate = productDeliveryDate;
	}

	public String getProductQualityCheck() {
		return productQualityCheck;
	}

	public void setProductQualityCheck(String productQualityCheck) {
		this.productQualityCheck = productQualityCheck;
	}

	public Date getProductprocessDate() {
		return productprocessDate;
	}

	public void setProductprocessDate(Date productprocessDate) {
		this.productprocessDate = productprocessDate;
	}

	public List<Products> getProduct() {
		return product;
	}

	public void setProduct(List<Products> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "ProductOrder [orderId=" + orderId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productDeliveryDate=" + productDeliveryDate + ", productQualityCheck=" + productQualityCheck
				+ ", productprocessDate=" + productprocessDate + ", product=" + product + "]";
	}
	
	

	


}
