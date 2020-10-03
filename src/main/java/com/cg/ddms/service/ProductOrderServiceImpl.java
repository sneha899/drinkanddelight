package com.cg.ddms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ddms.dao.ProductOrderDao;
import com.cg.ddms.dao.ProductsDao;
import com.cg.ddms.entity.ProductOrder;
import com.cg.ddms.entity.Products;
import com.cg.ddms.exception.ProductOrderException;

@Service
public class ProductOrderServiceImpl implements ProductOrderService{

	@Autowired
	ProductOrderDao productOrderDao;
	
	@Autowired
	ProductsDao productDao;
	
	@Override
	public List<Products> findAllProducts() throws ProductOrderException {
		List<Products> list= productDao.findAll();

		return list;
		
	}

	@Override
	public ProductOrder addProductOrder(ProductOrder order) throws ProductOrderException {

		
		if(productDao.existsById(order.getOrderId())) {
			throw new ProductOrderException("orderId already Exists");
		}
		else {
	return productOrderDao.save(order);
		}
	}

	/*@Override
	public List<ProductOrder> getAllProductOrders() {
		return productOrderDao.findAll();
	}*/

	@Override
	public ProductOrder getProductOrderDetailById(String orderId) {
		return productOrderDao.getOne(orderId);
	}

	

	@Override
	public ProductOrder updateProductOrder(ProductOrder order) {
		return productOrderDao.save(order);
	}

	@Override
	public ProductOrder update(String orderId, String deliveryStatus) {
		ProductOrder order=productOrderDao.getOne(orderId);
		order.setDeliveryStatus(deliveryStatus);
		
		return productOrderDao.save(order);
	}
	

}
