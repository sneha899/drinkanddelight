package com.cg.ddms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ddms.entity.ProductOrder;

@Repository
public interface ProductOrderDao extends JpaRepository<ProductOrder,Integer> {
	

}
