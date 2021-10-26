package com.pocgic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


	@RequestMapping(method = RequestMethod.GET, value = "/api/pocgic")
	public String sayHello() {
		return "Hello World -- I am here to give you a short POC of EKS for GIC1";
	}


}
