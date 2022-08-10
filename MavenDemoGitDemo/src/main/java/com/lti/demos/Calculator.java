package com.lti.demos;

public class Calculator {

	
		
		public String sayHello()
		{
			return "Hello World";
		}
		
		public int addNos(int x,int y)
		{
			int result=x+y;
			return result;
			
		}
		
		public int subNos(int a,int b)
		{
			int result=a-b;
			return result;
			
		}
		
		public void searchEmp(int empId)
		{
			if(empId==0)
			{
				throw new ArithmeticException("U entered 0");
			}
			else
			{
				System.out.println("Do something");
			}
		}
		
		
	}


