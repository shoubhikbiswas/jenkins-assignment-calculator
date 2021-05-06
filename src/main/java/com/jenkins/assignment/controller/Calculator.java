package com.jenkins.assignment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculator")
public class Calculator {
	
	@GetMapping("add")
	public int add(@RequestParam int a, @RequestParam int b) {
		return a + b;
	}
	
	@GetMapping("sub")
	public int substract(@RequestParam int a, @RequestParam int b) {
		return a - b;
	}
	
	@GetMapping("mul")
	public int multiply(@RequestParam int a, @RequestParam int b) {
		return a * b;
	}
	
	@GetMapping("div")
	public int divide(@RequestParam int a, @RequestParam int b) {
		return a / b;
	}
	
	
//	@GetMapping("square")
//	public int square(@RequestParam int a) {
//		return a * a;
//	}
//	
//	@GetMapping("cube")
//	public int cube(@RequestParam int a) {
//		return a * a * a;
//	}
	
}
