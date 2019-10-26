/**
 * 
 */
package keg;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Owner
 *
 */
public class InsertionSort
{

	// Complete the insertionSort1 function below.
	static void insertionSort1(int n, int[] arr)
	{

		int lastNum = arr[n - 1];
		// System.out.println("lenght: " + arr.length + " " + lastNum);
		IntStream intStream1;
		for (int loop = n - 2; loop >= 0; loop--)
		{
			if (lastNum < arr[loop])
			{
				arr[loop + 1] = arr[loop];

			} else if (lastNum > arr[loop])
			{
				arr[loop + 1] = lastNum;
				break;
			}
			// if (loop > 0)
			{
				intStream1 = Arrays.stream(arr);

				intStream1.forEach(x -> System.out.print(x + " "));

				System.out.println();
			}
		}
		if (arr[0] > lastNum)
		{
			arr[0] = lastNum;

		}
		intStream1 = Arrays.stream(arr);

		intStream1.forEach(x -> System.out.print(x + " "));

		int begin = 1;
		int end = 10;
		List<Integer> numList = IntStream.range(begin, end)
				.filter(num -> num / 2 != 0)
				.boxed()
				.collect(Collectors.toList());

		// theIntStream.boxed().collect(Collectors.toList())

		// IntStream intStream1 = Arrays.stream(arr);
		// intStream1.sorted()
		// .forEach(x -> System.out.print(x + " "));

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args)
	{
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine()
				.split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++)
		{
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}
		System.out.println("array; " + Arrays.toString(arr));
		insertionSort1(n, arr);

		scanner.close();
	}

	/*
	 * Which one? For object arrays, both are calling the same Arrays.stream (refer
	 * example 1, JDK source code). For primitive arrays, I prefer Arrays.stream as
	 * well, because it returns fixed size IntStream directly, easier to manipulate
	 * it.
	 */
	public static void intStreamExample()
	{
		int[] intArray =
			{ 1, 2, 3, 4, 5 };

		// 1. Arrays.stream -> IntStream
		IntStream intStream1 = Arrays.stream(intArray);
		intStream1.forEach(x -> System.out.println(x));

		// 2. Stream.of -> Stream<int[]>
		Stream<int[]> temp = Stream.of(intArray);

		// Cant print Stream<int[]> directly, convert / flat it to IntStream
		IntStream intStream2 = temp.flatMapToInt(x -> Arrays.stream(x));
		intStream2.forEach(x -> System.out.println(x));
	}
}
