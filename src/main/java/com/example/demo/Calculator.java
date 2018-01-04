package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
	@RequestMapping("/add")
    public String add(@RequestParam String a, @RequestParam String b){
		int i1, i2;
		i1 = Integer.parseInt(a);
		i2 = Integer.parseInt(b);
        return String.valueOf(i1+i2);
    }
	@RequestMapping("/minus")
    public String minus(@RequestParam String a, @RequestParam String b){
		int i1, i2;
		i1 = Integer.parseInt(a);
		i2 = Integer.parseInt(b);
        return String.valueOf(i1-i2);
    }
	@RequestMapping("/multiply")
    public String multiply(@RequestParam String a, @RequestParam String b){
		int i1, i2;
		i1 = Integer.parseInt(a);
		i2 = Integer.parseInt(b);
        return String.valueOf(i1*i2);
    }
	@RequestMapping("/divide")
    public String divide(@RequestParam String a, @RequestParam String b){
		int i1, i2;
		i1 = Integer.parseInt(a);
		i2 = Integer.parseInt(b);
        return String.valueOf(i1/i2);
    }
}