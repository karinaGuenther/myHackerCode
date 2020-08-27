/**
 * 
 */
package com.anirak.challanges;

import java.util.*;
import java.util.Map.Entry;

/**
 * @author Owner
 *
 */
public class ClosestDiff
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int findNum = 35;
		int howmany = 4;
		Integer[] array =
			{ 12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56 };

		List<Integer> list = Arrays.asList(array);
		if (list.contains(findNum))
		{
			findNumbers1(list, findNum, howmany);
			findNumbers2(list, findNum, howmany);
		} else
		{
			System.out.println("number " + findNum + "doesn't exist");
		}
	}

	public static void findNumbers1(List<Integer> list, int findNum, int howMany)
	{
		int max = list.size();
		// Convert Array to list
		int min = 0;

		// look for the how many numbers that are the closest to findnum
		// 1. get the index of the found item
		int location = list.indexOf(findNum);

		if (location - howMany > 0)
		{
			min = location - howMany;
		}
		if (location + howMany < max)
		{
			max = location + howMany;
		}

	}

	public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm)
	{
		// Create a list from elements of HashMap
		List<Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(
				hm.entrySet());

		// Sort the list
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2)
			{
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		// put data from sorted list to hashmap
		HashMap<Integer, Integer> temp = new LinkedHashMap<>();
		for (Entry<Integer, Integer> aa : list)
		{
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}

	public static void findNumbers2(List<Integer> numberList, int findNum, int howMany)
	{
		// Key = location, difference
		HashMap<Integer, Integer> differences = new HashMap<>();
		int maxLocation = numberList.size();
		// Convert Array to list
		int minLocation = 0;
		int location = numberList.indexOf(findNum);

		if (location - howMany > 0)
		{
			minLocation = location - howMany;
		}
		if (location + howMany < maxLocation)
		{
			maxLocation = location + howMany;
		}
		int maxDiff = Math.max(numberList.get(location) - numberList.get(minLocation),
				numberList.get(maxLocation) - numberList.get(location));
		List<Integer> closestNums = new ArrayList<>();

		// get all the differences
		for (Integer currentNum : numberList)
		{
			int currentIndex = numberList.indexOf(currentNum);
			differences.put(currentIndex, Math.abs(findNum - numberList.get(currentIndex)));
		}
		HashMap<Integer, Integer> sorted = sortByValue(differences);
		// get the number before and after - find the difference
		// closest get added to new array
	}
}
