package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBeforeAfter {
	Calculator c =new Calculator();
	int sum=0;
	
	@BeforeAll  //only once before all the test cases
	public static void testStartDbConn() {
		System.out.println("DB connection is up-only once");
	}
	
	@BeforeEach  //Before each test case
	public void testStartup()
	{
		sum=0;
		System.out.println("Sum is zero"+sum);
		
	}
	@Test
	public void testAddTwoNos() {
		System.out.println("Test case 1:");
		int result= c.addNos(100,200);
		Assertions.assertEquals(300, result);
	}
	
	@Test
	public void testSubTwoNos() {
		System.out.println("Test case 2:");
		int result= c.subNos(300,200);
		Assertions.assertEquals(100, result,"Plz check");
	}
	
	@AfterEach
	public void testShutDowm()
	{
		//sum=0;
		System.out.println("Sum is null");
		
	}
	
	@AfterAll
	public static void testShutdownConn() {
		System.out.println("DB connection is shut down");
	}
	
}
