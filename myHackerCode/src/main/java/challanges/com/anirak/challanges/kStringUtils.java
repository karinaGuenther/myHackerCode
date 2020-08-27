/**
 * 
 */
package com.anirak.challanges;

/**
 * @author Owner
 *
 */
public class kStringUtils
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		unitTestReverseString();

	}

	public static String reverseString(String myString)
	{
		if (myString == null || myString.isBlank())
		{
			return "";
		}
		char[] charArray = myString.toCharArray();
		int midpoint = charArray.length / 2;
		int backwards = charArray.length - 1;

		char holdChar;
		for (int index1 = 0; index1 < midpoint; index1++)
		{
			holdChar = charArray[index1];
			charArray[index1] = charArray[backwards];
			charArray[backwards] = holdChar;
			backwards--;
		}
		System.out.println(new String(charArray));
		return new String(charArray);

	}

	public static void unitTestReverseString()
	{

	}

}
