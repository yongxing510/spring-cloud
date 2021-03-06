package org.my.spring.cloud.service.provider;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello(@RequestParam String message) {
		System.out.println("HelloController.hello()" + message);
		return "hello:" + message;
	}
	@RequestMapping("/hellodesc")
	public String hello(@RequestParam String message,@RequestParam String desc) {
		System.out.println("HelloController.hello()" + message+",desc:"+desc);
		return "hello:" + message+",desc:"+desc;
	}

	@RequestMapping("/ribbon")
	public String ribbon() {
		System.out.println("HelloController.ribbon()");
		return "hello:ribbon";
	}
}
