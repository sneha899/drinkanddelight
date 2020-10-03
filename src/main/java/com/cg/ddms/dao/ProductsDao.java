package com.cg.ddms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ddms.entity.ProductOrder;
import com.cg.ddms.entity.Products;

@Repository
public interface ProductsDao extends JpaRepository<Products,String> {
	

}
