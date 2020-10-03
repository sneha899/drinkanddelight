package com.cg.ddms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ddms.entity.ProductOrder;
import com.cg.ddms.entity.Products;
import com.cg.ddms.exception.ProductOrderException;
import com.cg.ddms.service.ProductOrderService;

@RestController
@RequestMapping(value="/ProductOrder")
public class ProductOrderController {
	
	@Autowired
	ProductOrderService productOrderService;
	
	@GetMapping("/products")
	public ResponseEntity<List<Products>> findAllProducts() throws ProductOrderException
	{
		List<Products> list = productOrderService.findAllProducts();

		ResponseEntity<List<Products>>  rt = new ResponseEntity<List<Products>>(list,HttpStatus.OK);
		return rt;
	}

	@PostMapping(value = "/addProductOrder")
	public ResponseEntity<ProductOrder> addProductOrder(@RequestBody ProductOrder r) throws ProductOrderException {
		ProductOrder e = productOrderService.addProductOrder(r);
		if (e == null) {
			throw new ProductOrderException("Enter Valid Id");
		} else {
			return new ResponseEntity<ProductOrder>(e, HttpStatus.OK);
		}

	}

	/*@GetMapping(value = "/GetAllProductOrders")
	private ResponseEntity<List<ProductOrder>> getAllOrders() {
		
		List<ProductOrder> ProductOrderlist = productOrderService.getAllProductOrders();
		
		System.out.println(ProductOrderlist);
		return new ResponseEntity<List<ProductOrder>>(ProductOrderlist, HttpStatus.OK);
	}*/
	

	/*private ProductOrder ProductOrderIdNotFoundFallback(@PathVariable("orderId") String orderId) {
		
			return new ProductOrder("1000", "TV", 1000000);
	}*/



}
