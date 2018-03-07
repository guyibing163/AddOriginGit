package com.guyibing.util;


import org.junit.Before;

import org.junit.Test;

import static org.junit.Assert.*;



public class SquareTest1{

	private  Calculator calculator = new Calculator();


	@Before
	public void clearCalculator(){

        calculator.clear();

	}

 

	@Test
	public void square1(){
		int result = new Calculator().square(2);
		System.out.println(result);
        assertEquals(4, result);

	}    

 

	@Test   
	public void square2(){
		int result = new Calculator().square(2);
        System.out.println(result);
        assertEquals(4, result);

	}


	@Test   
	public void square3(){
		int result = new Calculator().square(2);
	    System.out.println(result);
        assertEquals(4, result);
 
	}

}
