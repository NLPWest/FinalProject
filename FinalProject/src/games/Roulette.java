package games;
import java.util.Scanner;
import java.util.Random;
public class roulette {
	
	public roulette()
	// TODO Auto-generated method stub
	{
		System.out.println("Welcome to the Roulette Game");
		int userGuess;
		int computerSecret;
		int red;
		int black;
	
		String result;
	
		
		computerSecret = (int)(Math.random() * 36 + 1);
		Scanner input = new Scanner(System.in);
		int quit = 0;
		do
		{
		System.out.println("Pick any number from 0 to 36 >>");
		System.out.println("1-odds/2-evens");
		System.out.println("1-red/2-black");
		userGuess = input.nextInt();
		
		if(userGuess < computerSecret)
		{
			if()
			result = "Your number is" + computerSecret;
		}
	  
	else if(userGuess > computerSecret)
	{
		result = "Your number is" + computerSecret;
	}
	else if(userGuess == computerSecret)
	{
	result = "You win";
	}
	else 
	{
		result = "You lose";
	}
	 displayMessage(result);
	 System.out.println("Do you want to quit ?/ n1- for yes / n2- for no >>");
		
	}while(1 != quit || userGuess != computerSecret);
	}
public static void displayMessage(String result)
{
	System.out.println(result);
}

	}

		

	    
		 