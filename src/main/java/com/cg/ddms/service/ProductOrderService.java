package com.cg.ddms.service;

import java.util.List;

import com.cg.ddms.entity.ProductOrder;
import com.cg.ddms.entity.Products;
import com.cg.ddms.exception.ProductOrderException;

public interface ProductOrderService {

	public List<ProductOrder> findAllProducts() throws ProductOrderException;

	ProductOrder addProductOrder(ProductOrder order) throws ProductOrderException;

	List<ProductOrder> getAllProductOrders();

	ProductOrder getProductOrderDetailById(String orderId);
	

	ProductOrder updateProductOrder(ProductOrder order);
	ProductOrder update(String orderId,String deliveryStatus);

}
