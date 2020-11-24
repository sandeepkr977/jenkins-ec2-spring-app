package com.web.springbootwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class SpringbootWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebAppApplication.class, args);
	}

	@GetMapping(value = "/info")
	public ResponseEntity<Map<String,Object>> getInfo(){
		Map<String,Object> data = new HashMap<>();
		data.put("version",0.1);
		data.put("name","jenkins-aws-spring");
		return new ResponseEntity<Map<String,Object>>(data, HttpStatus.ACCEPTED);
	}

}
