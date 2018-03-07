package com.guyibing.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.junit.runners.Parameterized;

import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

import java.util.Collection;




@RunWith(Parameterized.class)

public class SquareTest2 {
	
	private int param;

	private int result;    

	//构造函数，对变量进行初始化
	public SquareTest2(int param , int result){

	        this.param = param;

	        this.result = result;

	}

	@Parameters   

	public static Collection data(){

	        return Arrays.asList(new Object[][]{

	                {2, 4},

	                {0, 1},

	                {3, 98},

	        });

	}

	@Test   

	public void square(){

		int SquareResult = new Calculator().square(param);
		System.out.println(result+","+SquareResult);
	    assertEquals(result, SquareResult);

	}
}
 


