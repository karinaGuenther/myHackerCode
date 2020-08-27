/**
 * 
 */
package com.anirak.challanges;

/**
 * @author Owner
 *
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class countingValleys
{

	private String first;
	private String last;

	// Complete the countingValleys function below.
	static int countingValleys(int n, String s)
	{
		char[] trip = s.toCharArray();

		int prevLevel = 0;
		int currlevel = 0;
		int valley = 0;
		for (char dir : trip)
		{

			if (dir == 'U')
			{
				currlevel++;
			} else
			{
				currlevel--;
			}
			if (currlevel < 0 && prevLevel == 0)
			{
				valley++;
			}
			prevLevel = currlevel;

		}
		return valley;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException
	{
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
				"D:\\myProgramming\\workspace\\HackerTests\\src\\resources\\testOutput.txt"));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String s = scanner.nextLine();

		int result = countingValleys(n, s);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}

	@Override
	public String toString()
	{
		// TODO Auto-generated method stub

		return first + " " + last;
		// super.toString();
	}
}
