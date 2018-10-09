/**************************************
 * Name: Andrew Moss
 * 
 * Class: CIS 016 - Java
 * 
 * Assignment: 04_1D_Arrays
 * 
 * Date: 9/26/2018
 * 
 **************************************/

package arrays_1D;
import java.lang.reflect.Array;  //dynamically create and access Java arrays
import java.lang.Math;           //library for generating random numbers
import java.util.*;              //import all util types
import java.io.*;                //import all io types
public class Arrays_1D 
{

	public static void main(String[] args) throws FileNotFoundException
	{
		// TODO Auto-generated method stub
		
		int arraySize = 1000;                        //set array size to 1000
		boolean debug = false;                       //boolean value for personal debugging
		double[] arrayList = new double[arraySize];  //declaring and creating array
		double sum = 0.0;                            //double variable to hold sum value
		double average = 0.0;                        //double variable to hold average values
		int count = 0;                               //counter for each element in arrays
		
		//create file
		String filename = "output.txt";
		PrintWriter pw = new PrintWriter(filename);
		
		//populate arrayList with random numbers and add to sum variable
		for(int i = 0; i < arrayList.length; i++)
		{
			arrayList[i] = Math.random() * 100;   //assign random numbers from 1-100 to arrayList
			System.out.println();
	
			if(debug) {
				System.out.println(arrayList[i]);  //use to test if array list was populated
			}
			
			sum += arrayList[i];
		}
		
		average = sum/arrayList.length;            //calculate the average of the numbers in the arrayList
		
		//print to console
		System.out.printf("Average of array is ");  
		System.out.printf("%.2f", average);         //round number to two decimal places
		System.out.println();
		
		//prints to file
		pw.println("Average of array is ");
		pw.printf("%.2f", average);          //prints average of array with proper formating -- 2 decimals
		pw.println();                        //to output next line
		
		for(int i = 1; i <= 100; i++)
		{
			for(int j = i; j < arrayList.length; j++)
			{
				//rounding values for counting
				if(Math.ceil(arrayList[j]) == i)  
				{
					count++;
				}
			}
			
			//prints to console
		    System.out.println("The number " + i + " appears " + count + " times.");
			
			//prints to file
			pw.write("The number " + i + " appears " + count + " times.");
			pw.println();
	
			count = 0;
		}
		
		//closes file
		pw.close();                   
			
	}

}
