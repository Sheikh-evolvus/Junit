package com.example.demo;

public class Grade {
	public String determinegrade(int numgrade)
	{
		if(numgrade < 0)
		{
			throw new IllegalArgumentException("number grade cannot be identified");
			
		}
		else if(numgrade < 35)
		{
			return "Fails";
		}
		else if(numgrade < 60)
		{
			return "Second class";
		}
		else if(numgrade < 75)
		{
			return "First class";
		}
		else if(numgrade < 90)
		{
			return "Distinction";
		}
		else 
		{
			return "Extraordinary";
		}
	}

}
