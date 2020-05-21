package keg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
/**
 * 
 */
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

/**
 * @author Owner
 *
 */
public class ConvertExample
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int t = 0; t < n; t++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + b);
		}
		System.out.println("End solurtion");

	}

	public void useBufferReader() throws IOException
	{
		String thisLine = null;
		List<Integer> numsList = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arraySize = 0;
		List<Integer> myIntegers = new ArrayList<Integer>();

		while ((thisLine = br.readLine()) != null)
		{
			String[] lineString = thisLine.split(" ");

			numsList = Arrays.stream(lineString)
					.map(Integer::parseInt)
					.collect(Collectors.toList());
			System.out.println(numsList);
			// lthis is the initial one... save it.
			if (numsList.size() == 1)
			{
				arraySize = numsList.get(0);
			} else
			{
				myIntegers.add(findSubArray(numsList));
			}
		}
		/*
		 * String[] nums = line1.trim() .substring(arraysize) .split(" "); List<Integer>
		 * numsList = Arrays.stream(nums) .map(Integer::parseInt)
		 * .collect(Collectors.toList());
		 */
	}

	/**
	 * @param  numsList
	 * @return
	 */
	private Integer findSubArray(List<Integer> numsList)
	{
		int prevNum = 0;
		HashMap<Integer, Integer> subArraySize = new HashMap<>();
		for (int numLoop = 0; numLoop < numsList.size(); numLoop++)
		{
			int currentNum = numsList.get(numLoop);
			subArraySize.putIfAbsent(currentNum, 1);
			if (currentNum == prevNum)
			{
				subArraySize.computeIfPresent(currentNum, (k, v) -> v + 1);
			}
			prevNum = currentNum;
		}
		Entry<Integer, Integer> myNum = subArraySize.entrySet()
				.stream()
				.max(Map.Entry.comparingByValue(Integer::compareTo))
				.get();
		System.out.println(myNum.getValue());
		return myNum.getValue();

	}

	/**
	 * Note that s -> Integer.parseInt(s) could be replaced with Integer::parseInt
	 * (see Method references)
	 * 
	 * https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html
	 */
	private void convertExample()
	{
		List<String> stringList = Arrays.asList("1", "2", "3");
		List<Integer> integerList = convertList(stringList, s -> Integer.parseInt(s));

		// for arrays
		String[] stringArr =
			{ "1", "2", "3" };
		Double[] doubleArr = convertArray(stringArr, Double::parseDouble, Double[]::new);

	}

	/*
	 * String[] numberList = yourString.split("\\s+"); List<Integer> myList = new
	 * ArrayList<Integer>(); for(String num : numberList){
	 * myList.add(Integer.parseInt(num)); }
	 */
	// for lists
	public static <T, U> List<U> convertList(List<T> from, Function<T, U> func)
	{
		return from.stream()
				.map(func)
				.collect(Collectors.toList());
	}

	// for arrays
	public static <T, U> U[] convertArray(T[] from, Function<T, U> func, IntFunction<U[]> generator)
	{
		return Arrays.stream(from)
				.map(func)
				.toArray(generator);

	}

	/**
	 * showing different ways to convert char to int
	 */
	public static void convertInt()
	{
		char ch = '1';
		int num = Integer.parseInt(String.valueOf(ch));
		char ch1 = 'P';
		char ch2 = 'h';

		// conversion using Character.getNumericValue()
		int asciiVal1 = Character.getNumericValue(ch1);
		int asciiVal2 = Character.getNumericValue(ch2);
		System.out.println("ASCII value of char " + ch1 + " is: " + asciiVal1);
		System.out.println("ASCII value of char " + ch2 + " is: " + asciiVal2);
	}

}
