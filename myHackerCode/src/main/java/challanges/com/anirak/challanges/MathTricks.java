package com.anirak.challanges;

import static java.util.stream.Collectors.toList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Owner
 *
 */
public class MathTricks
{

	public static void main(String[] args) throws IOException
	{
		calcIntegersDivBy();
		calcPrimes();
		inclusiveRange(5, 20);

	}

	public static void calcPrimes()
	{
		List<Integer> primes = new ArrayList<>();
		int l = 5;
		int r = 10;
		for (int i = l; i <= r; i++)
		{
			// System.out.println("math result: i, l, divided " + i + l + i / 2);
			if (i % 2 != 0)
			{
				primes.add(i);
			}

		}

		System.out.println("odds = " + primes);
	}

	/**
	 * find the number of integers within the range of two specified numbers and
	 * that are divisible by another number.
	 * 
	 * this works because of old math laws. tag: math trick
	 * 
	 * @param args
	 */
	public static void calcIntegersDivBy()
	{
		int x = 5;
		int y = 20;
		int p = 3;
		int result = 0;
		if (x % p == 0)
			result = (y / p - x / p + 1);
		else
			result = (y / p - x / p);
		System.out.println(result);
	}

	/**
	 * this returns a all numbers within a range
	 * 
	 * @param  from
	 * @param  limit
	 * @return
	 */
	public static List<Integer> streamRange(int from, int limit)
	{

		return IntStream.range(from, from + limit)
				.boxed()
				.collect(toList());
	}

	public static List<Integer> inclusiveRange(int from, int limit)
	{
		List<Integer> incRangeIntegers = IntStream.rangeClosed(from, from + limit)
				.boxed()
				.collect(toList());
		System.out.println("inc range integers: " + incRangeIntegers.toString());
		return incRangeIntegers;
	}

}
