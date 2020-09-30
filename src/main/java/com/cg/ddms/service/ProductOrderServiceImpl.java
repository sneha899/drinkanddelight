package com.cg.ddms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ddms.dao.ProductOrderDao;
import com.cg.ddms.entity.ProductOrder;
import com.cg.ddms.exception.ProductOrderException;

@Service
public class ProductOrderServiceImpl implements ProductOrderService{

	@Autowired
	ProductOrderDao productDao;
	
	@Override
	public List<ProductOrder> findAllProducts() throws ProductOrderException {
		List<ProductOrder> list= productDao.findAll();

		return list;
	}
	

}
