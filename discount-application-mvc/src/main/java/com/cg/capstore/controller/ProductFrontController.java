package com.cg.capstore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.cg.capstore.bean.Products;
@RestController
public class ProductFrontController {
	
	@RequestMapping("/index")
	public ModelAndView getProduct() {
		RestTemplate rt= new RestTemplate();
		List<Products>  p =rt.getForObject("http://localhost:9095/getProducts", ArrayList.class);
		return new ModelAndView("index","product",p);
	
		
		
	}
}
		
		
		/*@RequestMapping("/products")
	public Products getProduct(@RequestParam String p_id)  {
		RestTemplate rt = new RestTemplate();
		Products p =rt.getForObject("http://localhost:9095/getproducts?p_id=101="+p_id, Products.class);
		return p;
		
	}*/


