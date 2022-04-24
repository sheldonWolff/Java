package com.dev_thatsux.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	@RequestMapping("/")
	public String hello(@RequestParam(value="name", required=false) String searchQuery, @RequestParam(required=false) String last_name) {
		if(searchQuery == null) {
			return "Hello Human";
		}
		else if(last_name == null) {
			return "Hello " + searchQuery;
		}
		else {
			return "Hello " + searchQuery + " " + last_name;
		}
	}
}
