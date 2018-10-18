//package games;
//import java.util.Scanner;
//import java.util.Random;
//
//public class Craps {
//
//	public static void craps(String[] args)
//	// TODO Auto-generated method stub
//	{
//		  int craps;
//		  int dice1 = 0;
//		  int dice2 = 0;
//		  int point = 0;
//		  int newScore = 0;
//		  int wins = 0;
//		  int loss = 0;
//		  Scanner inputDevice = new Scanner(System.in);
//		  System.out.println("Welcome to Craps");
//		  for (int i = 0; i < 10000; i++)
//		  {
//		    System.out.println ("roll the dices");
//		    int score = roll (dice1, dice2);
//		    System.out.println ("\n score " + score);
//
//		    if (score == 11 || score == 7)
//		    {
//		      System.out.println ("\n Score = " + score);
//		      System.out.println ("you win");
//		      wins = wins + 1;
//		    }
//		    if (score == 2 || score == 3 || score == 12)
//		    {
//		      System.out.println ("\n Score = " + score);
//		      System.out.println ("you lose");
//		      loss = loss + 1;
//		    }
//	}
//
//}
//
//	private static int roll(int dice1, int dice2) 
//	// TODO Auto-generated method stub
//	{
//		Random randomGenerator = new Random ();
//		  int dice1 = randomGenerator.nextInt (6) + 1;
//		  int dice2 = randomGenerator.nextInt (6) + 1;
//		  
//		  System.out.println(" dice1 = " + dice1 + " dice2 = " + dice2 );
//		return 0;
//	}
//}
