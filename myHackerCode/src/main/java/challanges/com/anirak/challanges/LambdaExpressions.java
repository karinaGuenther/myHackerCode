/**
 * 
 */
package com.anirak.challanges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

/**
 * @author Owner
 *
 */
public class LambdaExpressions
{

	// default values:
	/**
	 * // @formatter:off
	 * 5
	 * 1 4
	 * 2 5
	 * 3 898
	 * 1 3
	 * 2 12
	 *
	 */
	// @formatter:on
	/*
	 * {"1 4", "2 5", "3 898", "1 3", "2 12"}
	 */
	static int numberInput = 5;
	private static boolean test = true;

	public static void main(String[] args) throws IOException
	{
		if (test == true)
		{
			testMethod();
		} else
		{
			originalCode();
		}

	}

	/**
	 * @throws IOException
	 * @throws NumberFormatException
	 * 
	 */
	private static void originalCode() throws NumberFormatException, IOException
	{
		MyMath ob = new MyMath();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PerformOperation op;
		boolean ret = false;
		String ans = null;
		while (T-- > 0)
		{
			String s = br.readLine()
					.trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1)
			{
				op = ob.isOdd();
				ret = ob.checker(op, num);
				ans = (ret) ? "ODD" : "EVEN";
			} else if (ch == 2)
			{
				op = ob.isPrime();
				ret = ob.checker(op, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";
			} else if (ch == 3)
			{
				op = ob.isPalindrome();
				ret = ob.checker(op, num);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

			}
			System.out.println(ans);
		}

	}

	/**
	 * this is almost identical with the original hacker code except it uses
	 * hardcoded input.
	 */
	public static void testMethod()
	{

		MyMath myMath = new MyMath();

		String testValues[] = new String[]
			{ "1 4", "2 5", "3 898", "1 3", "2 12" };

		int T = numberInput;
		// Integer.parseInt(br.readLine());

		PerformOperation perforOper;
		boolean ret = false;
		String ans = null;
		while (T-- > 0)
		{
			String s = testValues[numberInput - T];
			System.out.println("checking test values: " + s);
			// br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);

			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1)
			{
				perforOper = myMath.isOdd();
				ret = MyMath.checker(perforOper, num);
				ans = (ret) ? "ODD" : "EVEN";
			} else if (ch == 2)
			{
				perforOper = myMath.isPrime();
				ret = MyMath.checker(perforOper, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";
			} else if (ch == 3)
			{
				perforOper = myMath.isPalindrome();
				ret = MyMath.checker(perforOper, num);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

			}
			System.out.println(ans);
		}

	}
}

interface PerformOperation
{
	boolean check(int a);
}

class MyMath
{
	public static boolean checker(PerformOperation p, int num)
	{
		return p.check(num);
	}

	/**
	 * @return
	 */
	public PerformOperation isPalindrome()
	{
		// TODO Auto-generated method stub
		return null;
	}

	public static boolean isPrime(int number)
	{

		return number > 3 && IntStream.range(4, (int) Math.sqrt(number))
				.noneMatch(i -> number % i == 0);
	}

	/**
	 * @return
	 */
	public PerformOperation isPrime()
	{
		// n needs to be a functional interface.

		return null;
		// String n;
		/*
		 * int mynum = n -> n; System.out.println("number to check: " + mynum); if
		 * (mynum == 0) return false; if (mynum < 4) return true;
		 * 
		 * if (isEven()) return false;
		 */
		// n ->; //
		/*
		 * for(int i=2;i<=numberToCheck/2;i++) { //numberToCheckber is dived by itself
		 * remainder=numberToCheck%i; System.out.println(numberToCheck+" Divided by "+ i
		 * + " gives a remainder "+remainder);
		 * 
		 * //if remainder is 0 than numberToCheckber is not prime and break loop. Elese
		 * continue loop if(remainder==0) { isPrime=false; break; }
		 */

	}

	/**
	 * @param num
	 * @return
	 */
	public PerformOperation isEven()
	{
		// TODO Auto-generated method stub
		return n -> n % 2 == 0;
	}

	/**
	 * @return
	 */
	public PerformOperation isOdd()
	{
		// TODO Auto-generated method stub
		return n -> n % 2 != 0;
	}

}