package com.cg.ddms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ddms.entity.ProductOrder;
import com.cg.ddms.entity.Products;
import com.cg.ddms.exception.ProductOrderException;
import com.cg.ddms.service.ProductOrderService;

@RestController
public class ProductOrderController {
	
	@Autowired
	ProductOrderService productOrderService;
	
	@GetMapping("products")
	public ResponseEntity<List<ProductOrder>> findAllProducts() throws ProductOrderException
	{
		List<ProductOrder> list = productOrderService.findAllProducts();

		ResponseEntity<List<ProductOrder>>  rt = new ResponseEntity<List<ProductOrder>>(list,HttpStatus.OK);
		return rt;
	}

	


}
