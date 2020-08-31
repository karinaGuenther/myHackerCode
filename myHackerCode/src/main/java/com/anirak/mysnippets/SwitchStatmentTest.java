/**
 * 
 */
package com.anirak.mysnippets;

/**
 * @author Owner This is to test out someones question about thw switch statment
 *         in Java Ranch.
 */
public class SwitchStatmentTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String string1 = "this is string 1";
		String string2 = "this is string 2";
		String testCh1 = "ch1";
		String testCh2 = "ch2";
		String choice = "ch2";
		// Their code:
		switch (choice)
		{
		case ("ch1"):
			System.out.println(string1);
			break;
		case ("ch2"):
			System.out.println("this was choice 2");
			break;
		}
		switch (choice)
		{
		case ("ch1"):
			System.out.println(string2);
			break;
		case ("ch2"):
			break;
		}

	}

}
