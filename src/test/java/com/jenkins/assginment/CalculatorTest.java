package com.jenkins.assginment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.jenkins.assignment.controller.Calculator;

class CalculatorTest {
	  
	final int a = 50;
	final int b = 25;
	
	@Test
	void testAdd() {
		assertEquals(75, new Calculator().add(a, b));
	}

	@Test
	void testSub() {
		assertEquals(25, new Calculator().substract(a, b));
	}

	@Test
	void testMul() {
		assertEquals(1250, new Calculator().multiply(a, b));
	}
	
	@Test
	void testDiv() {
		assertEquals(2, new Calculator().divide(a, b));
	}

	
}
