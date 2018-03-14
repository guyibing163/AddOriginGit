package com.guyibing.util;


import org.junit.Before;

import org.junit.Test;

import static org.junit.Assert.*;



public class SquareTest1{

	private  Calculator calculator = new Calculator();


	@Before
	public void clearCalculator(){
		try
		{
			calculator.clear();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage().toString());
		}

	}

 

	@Test
	public void square1(){
		try
		{
			int result = new Calculator().square(2);
			System.out.println(result);
			assertEquals(4, result);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage().toString());
		}

	}    

 

	@Test   
	public void square2(){
		try
		{
			int result = new Calculator().square(2);
        	System.out.println(result);
        	assertEquals(4, result);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage().toString());
		}

	}


	@Test   
	public void square3(){
		try
		{
			int result = new Calculator().square(2);
			System.out.println(result);
			assertEquals(4, result);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage().toString());
		}
 
	}
	
	@Test   
	public void add1(){
		try
		{
			int result = new Calculator().add(2,2);
			System.out.println(result);
			assertEquals(4, result);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage().toString());
		}
 
	}

	@Test   
	public void multiply1(){
		try
		{
			int result = new Calculator().multiply(2,2);
			System.out.println(result);
			assertEquals(4, result);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage().toString());
		}
 
	}
}
