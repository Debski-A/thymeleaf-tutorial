package com.debski.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.debski.services.ProductService;

/**
 * Created by jt on 1/20/16.
 */
@Controller
public class IndexController {
	
	@Autowired
	private ProductService productService;

    @RequestMapping("/")
    public String getIndex(Model model){

    	model.addAttribute("products", productService.listProducts());
    	
        return "index";
    }
    
    @RequestMapping("secured")
    public String secured(){
        return "secured";
    }
}