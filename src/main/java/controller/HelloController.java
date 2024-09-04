package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloController {
	
	public static void main(String[] args) {
		SpringApplication.run(HelloController.class, args);
	}

	@GetMapping("/saludo")
	public String saludo(@RequestParam(value = "name", defaultValue = "mundo") String name) {
		return String.format("Hello %s!", name);
	}
}
