package com.ibm.demo;


import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.demo.service.OrderService;

@RestController

public class UserController {
	Logger logger = Logger.getLogger(UserController.class.getName());
	@Autowired
	OrderService orderServive;
	@GetMapping("/hello")  //"/"means no path
String hello() {
		logger.setLevel(Level.WARNING);
	    logger.log(Level.WARNING,orderServive.hashCode()+"printed");
	    return "hello";
}
}
