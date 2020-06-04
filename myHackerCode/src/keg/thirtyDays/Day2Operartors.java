/**
 * Given the meal price (base cost of a meal), tip percent (the percentage of
 * the meal price being added as tip), and tax percent (the percentage of the
 * meal price being added as tax) for a meal, find and print the meal's total
 * cost.
 * 
 * Note: Be sure to use precise values for your calculations, or you may end up
 * with an incorrectly rounded result!
 * 
 * Input Format
 * 
 * There are lines of numeric input: The first line has a double, (the cost of
 * the meal before tax and tip). The second line has an integer, (the percentage
 * of being added as tip). The third line has an integer, (the percentage of
 * being added as tax).
 * 
 * Output Format
 * 
 * Print the total meal cost, where is the rounded integer result of the entire
 * bill ( with added tax and tip).
 * 
 * 
 */
package keg.thirtyDays;

import java.util.Scanner;

/**
 * @author Owner
 *
 */
public class Day2Operartors
{
	// Complete the solve function below.
	static void solve(double mealCost, int tipPercent, int taxPercent)
	{
		// tip = meal_cost *(tip_percent / 100)
		// tax - meal_cost *(tax_percent / 100)
		// totalCost = meal_cost + tip + tax;
		// round(totalCost to the nearest dollar
		System.out.println("calc tip: " + calcPercent(mealCost, tipPercent));
		double costDecimal = mealCost + calcPercent(mealCost, tipPercent)
				+ calcPercent(mealCost, taxPercent);
		System.out.println(Math.round(costDecimal));
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args)
	{
		double mealCost = 12.00;
		// scanner.nextDouble();
		// scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int tipPercent = 20;
		// scanner.nextInt();
		// scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int taxPercent = 8;
		// scanner.nextInt();
		// scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		solve(mealCost, tipPercent, taxPercent);

		scanner.close();
	}

	private static double calcPercent(double mealCost, int percent)
	{

		System.out.println("percent: " + ((double) percent / 100));
		return mealCost * ((double) percent / 100);
	}

}
