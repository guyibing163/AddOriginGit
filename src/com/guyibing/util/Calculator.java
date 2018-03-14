package com.guyibing.util;

public class Calculator {
    public int add(int a, int b){
    	try
    	{
    		return a + b;
    	}
    	catch (Exception e)
    	{
    		return 0;
    	}
    }
    
    public int subtract(int a, int b){
    	try
    	{
    		return a - b;
    	}
    	catch (Exception e)
    	{
    		return 0;
    	}
    }
    
    public int multiply(int a, int b){
    	try
    	{
    		return a * b;
    	}
    	catch (Exception e)
    	{
    		return 0;
    	}
    }
    
    public int divide(int a, int b){
    	try
    	{
    		return a / b;
    	}
    	catch (Exception e)
    	{
    		return 0;
    	}
    }
    
    public int square(int a){
    	try
    	{
    		return  a * a;
    	}
    	catch (Exception e)
    	{
    		return 0;
    	}
    }
    
    public int clear(){
    	try
    	{
    		return 1;
    	}
    	catch (Exception e)
    	{
    		return 0;
    	}
    }

}