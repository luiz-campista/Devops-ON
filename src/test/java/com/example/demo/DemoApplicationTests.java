package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		assert(true);
	}
	@GetMapping("/autoglass")
	String autoglass(){
		return "Pagina da Autoglass";
	}
}
