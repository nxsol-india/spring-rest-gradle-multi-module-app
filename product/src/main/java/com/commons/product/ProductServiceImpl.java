package com.commons.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService{

	@Override
	public List<Product> findAll() throws Exception {
		List<Product> plst =  new ArrayList<>(0);
		for (int i = 0; i < 5; i++) {
			Product product = new Product(i,"product name : "+i,"000"+i);
			plst.add(product);
		}
		return plst;
	}

}
