package com.guyibing.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test1() {
		int result = new Calculator().add(4, 2);
		System.out.println(result);
		assertEquals(6, result);

	}

	@Test
	public void test2() {
		int result = new Calculator().divide(4, 2);
		System.out.println(result);
		assertEquals(6, result);

	}
	
	@Test
	public void test3() {
		int result = new Calculator().multiply(4, 2);
		System.out.println(result);
		assertEquals(8, result);

	}
	
	@Test
	public void test4() {
		int result = new Calculator().subtract(4, 2);
		System.out.println(result);
		assertEquals(6, result);

	}
	
}
