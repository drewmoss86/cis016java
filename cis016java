/**************************************
 * Name: Andrew Moss
 * 
 * Class: CIS 016 - Java
 * 
 * Assignment: If/Else Statements
 * 
 * Date: 9/5/2018
 * 
 **************************************/

package if_else_statements;

import java.util.Scanner; //library for grabbing input from user

public class RollerCoaster 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); //Reading from System.in
		int age = 0;     //integer variable to store age value
		int weight = 0;  //integer variable to store weight value
		
		//check if value is a valid, positive integer
		do
		{
			System.out.print("Please enter age (positive integer): "); //Asks user for age
			while(!input.hasNextInt())
			{
				System.out.print("Please enter a valid integer for age! "); //Error message
				input.next();
			}
			age = input.nextInt();
		}while(age <= 0);

		do
		{
			System.out.print("Please enter weight (positive integer): "); //Asks user for weight
			while(!input.hasNextInt())
			{
				System.out.print("Please enter a valid integer for weight! "); //Error message
				input.next();
			}
			weight = input.nextInt();
		}while(weight <= 0);
		
		
		//If a person is younger than or equal to 10 years old and weights less than 80 pounds
		if(age <= 10 && weight < 80)
		{
			System.out.println("This person needs to ride the black roller coaster.");
		}
		
		//If a person is younger than or equal to 10 years old and weights between 80 and 200 pounds
		//(including weighing exactly 80 or 200 pounds)
		else if(age <= 10 && (weight >= 80 && weight <= 200))
		{
			System.out.println("This person needs to ride the green roller coaster.");
		}
		
		//If a person is younger than or equal to 10 years old and weights more than 200 pounds
		else if(age <= 10 && weight > 200)
		{
			System.out.println("This person needs to ride the yellow roller coaster.");
		}
		
		//If a person is younger than or equal to 20 years old but older than 10 and weights less than 80 pounds
		else if((age <= 20 && age > 10) && weight < 80)
		{
			System.out.println("This person needs to ride the silver roller coaster.");
		}
		
		//If a person is younger than or equal to 20 years old but older than 10 and weights between 80 and 200 pounds 
		//(including weighting exactly 80 or 200 pounds)
		else if((age <= 20 && age > 10) && (weight >= 80 && weight <= 200))
		{
			System.out.println("This person needs to ride the red roller coaster.");
		}
		
		//If a person is younger than or equal to 20 years old but older than 10 and weights more than 200 pounds
		else if((age <= 20 && age > 10) && weight > 200)
		{
			System.out.println("This person needs to ride the purple roller coaster.");
		}
		
		//Everyone else rides the pink roller coaster
		else
		{
			System.out.println("This person needs to ride the pink roller coaster.");
		}

		input.close();
		

	}

}
