/**************************************
 * Name: Andrew Moss
 * 
 * Class: CIS 016 - Java
 * 
 * Assignment: Strings
 * 
 * Date: 9/17/2018
 * 
 **************************************/
package strings;

import java.util.Scanner;  //library for grabbing input from user 


public class Strings 
{

	//alphaSort : method that sorts the cities lexicographically
	public static void alphaSort(String c1, String c2, String c3)
	{
		//if c1 is larger than c2, swap
		if(c1.compareTo(c2) > 0)
		{
			
			String temp = c1;
			c1 = c2;
			c2 = temp;
		}
		
		//if c1 is larger than c3, swap
		if(c1.compareTo(c3) > 0)
		{
			String temp = c1;
			c1 = c3;
			c3 = temp;
		}
		
		//if c2 is larger than c3, swap
		if(c2.compareTo(c3) > 0)
		{
			String temp = c2;
			c2 = c3;
			c3 = temp;
		}
		
		//print cities
		printCities(c1, c2, c3);
		
	}
	
	//printCities : method that prints all the cities in alphabetical order
	public static void printCities(String c1, String c2, String c3)
	{
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);  //initialize Scanner object for user input
		String city1 = "";     //initialize String variable to hold 1st city name
		String city2 = "";     //initialize String variable to hold 2nd city name
		String city3 = "";     //initialize String variable to hold 3rd city name
		
		System.out.println("Please input 3 city names separated by spaces in one line and press Enter.");
		
		city1 = input.next();  //stores 1st user input
		city2 = input.next();  //stores 2nd user input
		city3 = input.next();  //stores 3rd user input
		
		alphaSort(city1, city2, city3);
		
		input.close();
	

	}

}

