package games;
import java.util.Scanner;
import java.util.Random;
public class roulette {
	
	public roulette()
	// TODO Auto-generated method stub
	{
		System.out.println("Welcome to the Roulette Game");
		int userChoice;
		int [] odds = { 0,1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35};
		int [] evens = { 0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36};
		
		int[] randomNumbers = new int[36];
		
		for(int i = 0; i < randomNumbers.length; i++) 
		{
	          int i;
			
			[i] = (int)(Math.random() * 37);

	    }
		Scanner input = new Scanner(System.in);
		do
		{
			System.out.println("Pick any number from 0 to 36 >>");
			System.out.println("1-Odds\2- Evens >>");
			int userChoice = input.nextInt();
			
			if(userChoice == odds[i])
			{
				System.out.println("")
			}
			
		}
		 
}
}
		 