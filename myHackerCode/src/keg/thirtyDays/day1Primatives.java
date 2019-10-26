/**
 * 
 */
package keg.thirtyDays;

import java.util.Scanner;

/**
 * @author Owner
 *
 */
public class day1Primatives
{

	public static void main(String[] args)
	{
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		/* Declare second integer, double, and String variables. */
		int myInt = 0;
		double myDouble = 0;
		String myString = null;

		Scanner sc = new Scanner(System.in);

		/* Read and save an integer, double, and String to your variables. */
		System.out.println("Enter a integer");

		// Note: If you have trouble reading the entire String, please go back and
		// review the Tutorial closely.

		/* Print the sum of both integer variables on a new line. */
		System.out.println("Sum int values" + (i + myInt));
		/* Print the sum of the double variables on a new line. */
		System.out.println("Sum doubles: " + (d + myDouble));

		/*
		 * Concatenate and print the String variables on a new line; the 's' variable
		 * above should be printed first.
		 */
		System.out.println("both strings: " + s + myString);
		scan.close();
	}
}
