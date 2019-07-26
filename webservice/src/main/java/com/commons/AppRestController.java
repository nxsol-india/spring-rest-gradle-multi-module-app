package com.commons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.commons.agency.AgencyService;
import com.commons.product.ProductService;

@RestController("/api")
public class AppRestController {

	@Autowired
	AgencyService agencyService;
	
	@Autowired
	ProductService productService;

	//@ApiOperation(value = "Country List, no need token and userid, public API", notes = "Country List, no need token and userid, public API")
	@GetMapping("company")
	public ResponseEntity<Response> fetchCompanyData() throws Exception {
		try {
			return new ResponseEntity<Response>(new Response(ResultCode.SUCCESS, "SUCCESS").setResult(agencyService.findAll()), HttpStatus.OK); 
		}catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Response>(new Response(ResultCode.INTERNAL_SERVER_ERROR, e.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("product")
	public ResponseEntity<Response> fetchProductData() throws Exception {
		try {
			return new ResponseEntity<Response>(new Response(ResultCode.SUCCESS, "SUCCESS").setResult(productService.findAll()), HttpStatus.OK); 
		}catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Response>(new Response(ResultCode.INTERNAL_SERVER_ERROR, e.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
