package com.pilz.springbootreact;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


// tag::code[]
@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}

}
// end::code[]