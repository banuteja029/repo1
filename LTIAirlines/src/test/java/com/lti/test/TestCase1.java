package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.client.Main;
import com.lti.model.Flight;

public class TestCase1 {

	@Test
	public void testAdd() {
//		fail("Not yet implemented");
		
		int num1=10;
		int num2=20;
		
		assertEquals(30,Main.add(num1, num2));
	}
	
	@Test
	public void testEquality()
	{
		int num1=10;
		int num2=10;
		assertTrue(Main.compare(num1, num2));
	}
	
	@Test
	public void testObject()
	{
		Flight f1= new Flight(1002,"hyd","newyork");
		Flight f2=new  Flight(1002,"hyd","newyork");
		
//		assertSame("objects are not same",f1,f2); //checks references
		assertEquals("objects are equal",f1, f2);  //checks values
		
		
	}
	

}
