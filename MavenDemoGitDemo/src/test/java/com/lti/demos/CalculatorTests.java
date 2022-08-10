package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTests {
	
	Calculator c = new Calculator();
	
	@Test
	public void testSayHello() 
	{
		Assertions.assertEquals("Hello World", c.sayHello());
		
	}
	@Test
	public void testAddTwoNos() {
		int result= c.addNos(100,200);
		Assertions.assertEquals(300, result);
	}
	
	@Test
	public void testSubTwoNos() {
		int result= c.subNos(300,200);
		Assertions.assertEquals(100, result);
	}
	
	@Test
	public void testAssertNulls() 
	{
		String s1=null;
		String s2="Dhanu";
		Assertions.assertNull(s1);
		Assertions.assertNotNull(s2);
	}
	
	@Test
	public void testAssertFalse() 
	{
	
		Assertions.assertFalse("Riya".length()==10);
		Assertions.assertFalse(10>20,"10 is smaller");
		Assertions.assertNotEquals("Hello","hello");
	}
	
	@Test
	public void testArrays() 
	{
		ArrayList<Integer> myList=new ArrayList<>();
		Assertions.assertEquals(0,myList.size());
		Assertions.assertTrue(myList.isEmpty());
		myList.add(100);
		myList.add(200);
		Assertions.assertEquals(2,myList.size());
		
		
		
	}

}
