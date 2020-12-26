package com.stcksimplify.restservices.springbootbuildingblocks.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {

	//URI - /helloWorld
	//@RequestMapping(method = RequestMethod.GET, path = "/helloWorld")
	@GetMapping("/helloWorld1")
	public String hellowWorld() {
		return "Hello World";
	}

	@GetMapping("/helloWorld-bean")
	public UserDetails helloWorldBean() {
		return new UserDetails("Daizy", "Vatsa", "Toronto");
	}
}
