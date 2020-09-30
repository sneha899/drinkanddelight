package com.cg.ddms.service;

import java.util.List;

import com.cg.ddms.entity.ProductOrder;
import com.cg.ddms.exception.ProductOrderException;

public interface ProductOrderService {

	public List<ProductOrder> findAllProducts() throws ProductOrderException;


}
