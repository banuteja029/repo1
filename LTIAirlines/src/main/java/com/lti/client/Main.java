package com.lti.client;

import com.lti.model.Flight;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Flight f = new Flight(111, "hyderabad", "ladakh");
//		System.out.println(f.getFlightId()+" " + f.getSource() +"  "+f.getDestination());

		int num1 = 20;
		int num2 = 30;

		if (add(num1, num2) == 50) {
			System.out.println("test passed");
		}

		else {
			System.out.println("test failed");
			System.out.println("test failed now");
		}
	}

	public static int add(int n1, int n2) {

		return n1 + n2;
	}

	public static boolean compare(int n1,int n2)
	{
		if(n1==n2)
			return true;
		else
			return false;
	}

}
