/**
 * 
 */
package com.anirak.thirty;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day6Summary
{

	List<String> oddLetters = new ArrayList<>();
	List<String> evenLetters = new ArrayList<>();

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

	}

	public void convertString(String myString)
	{
		char[] myCharArray = myString.toCharArray();
		for (int i = 0; i < myString.length(); i++)
		{
			// Print each sequential character on the same line
			System.out.print(myCharArray[i]);
		}
		// Print a newline
		System.out.println();
	}
}
