/**************************************
 * Name: Andrew Moss
 * 
 * Class: CIS 016 - Java
 * 
 * Assignment: Bulgarian Solitare (Part 2)
 * 
 * Date: 10/10/2018
 * 
 **************************************/
package bulgarian_solitare;
import java.util.*;
import java.io.*;
import java.lang.Object;
public class BulgarianSolitaire 
{
	//create an ArrayList object representing the cards and ideal cards set utilizing ArrayList library
	private ArrayList<Integer> cards = new ArrayList<Integer>();
	private ArrayList<Integer> idealCards = new ArrayList<Integer>();
	private int cardPiles = 0;

	//create Random object to help generate random numbers between 0-46
	Random randValue = new Random();

	//match : is a boolean function that determines if the cards array matches the ideal cards. If so, returns true, otherwise, false;
	public boolean match(ArrayList<Integer> a)
	{
		//since the array is sorted, all we have to do is compare in array passed in with the index number i
		for(int i = 0; i < a.size(); i++) {
			if(a.get(i) != i + 1) {
				return false;
			}
		}
		return true;
	}

	//removeZeroes : is a void function that removes zeros from the array. Returns nothing.
	public static void removeZeros(ArrayList<Integer> a)
	{
		//go through the array element by element to find 0s and remove them
		for(int i = 0; i < a.size(); i++)
		{
			if(a.get(i) == 0)
			{
				a.remove(i);  //remove element 0
				i--; //decrement
			}
		}
	}
	
	//setIdeal : is a void function that takes an ArrayList object and sets an ArrayList with the ideal cards. Returns nothing.
	public void setIdeal(ArrayList<Integer> a)
	{

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number of piles: ");
		cardPiles = input.nextInt();
		
		//create dynamic array
		a = new ArrayList<Integer>();
		
		//create array of ideal cards for comparison
		for(int i = 1; i < cardPiles + 1; i++)
		{
			a.add(i);
		}
		
		idealCards = a;		
		
		input.close();
	}
	
	public int totalCardsCalc(int cP)
	{
		int sum = 0;
		while(cP > 0)
		{
			sum += (cP--);
		}

		return sum;
	}
	
	//initGame : is a void function that takes an ArrayList object and initializes the game
	public void initGame(ArrayList<Integer> a)
	{
		//create dynamic array
		a = new ArrayList<Integer>();

		int sum = 0;          //INT variable holding the values that have been deducted from the totalCards
//		int totalCards = 45;  //INT variable representing total number of cards being used
		
		//create array of ideal cards for comparison
		for(int i = 0; i < totalCardsCalc(cardPiles); i++)
		{
			//adds random value between 0 (inclusive) and 46 (exclusive) minus total that has already been accounted for	
			//once it reaches 0, the remaining elements will hold 0
			a.add(randValue.nextInt((totalCardsCalc(cardPiles)+1)-sum));
			sum += a.get(i);
			
		}
		
		//eliminate all 0 values
		removeZeros(a);
		
		//sort in ascending order
		Collections.sort(a); 
		
		//assign a to cards array
		cards = a;

	}
	
	//oneTurn : is a void function that takes an ArrayList object and simulates one turn. Returns nothing.
	public void oneTurn(ArrayList<Integer> a)
	{
		
		int sum = 0;  //INT variable holding each card deducted from each array index

		for(int i = 0; i < a.size(); i++)
		{
			//subtract each element in array by 1 and set back to array
			a.set(i, a.get(i) - 1);
			sum += 1;
		}
		a.add(a.size(), sum);
		
		//eliminate all 0 values
		removeZeros(a);  
		
		//sort in ascending order
		Collections.sort(a);  

		//print out current arrangement of cards after one turn
		System.out.println(a);
		
	}
	
	public BulgarianSolitaire() 
	{
		int turnCounter = 0;  //INT variable to track the number of turns it took before reaching ideal card set

		//Calling setIdeal cards 
		setIdeal(idealCards);
		System.out.println("Ideal Cards: " + idealCards);	
		
		//Initialize game
		initGame(cards);
		System.out.println("Starting Cards: " + cards);
		
		//Keep playing until cards match
		while(match(cards) == false) {
			oneTurn(cards);
			turnCounter++;
		}
			
		System.out.println("Cards Match! This set of cards took " + turnCounter + " turns to match.");
		
		
	}
	

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//Create a BulgarianSolitaire object to run one Bulgarian Solitaire game;
		BulgarianSolitaire game = new BulgarianSolitaire();
	}
		



}
