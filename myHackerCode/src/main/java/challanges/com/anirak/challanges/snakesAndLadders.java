package com.anirak.challanges;

/**
 * 
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * @author Owner
 *
 */
public class snakesAndLadders
{

	private int maxRoll = 6;
	private static int boardSize = 100;
	private static int rollsCount = 0;
	// Complete the quickestWayUp function below.
	private static List<Integer> movesList = new ArrayList<>();

	static int quickestWayUp(int[][] ladders, int[][] snakes)
	{ // sort ladders and snakes to the
		// base number.
		Map<Integer, Integer> ladderMap = Arrays.stream(ladders)
				.collect(Collectors.toMap(kv -> kv[0], kv -> kv[1], (oldV, newV) -> newV,
						TreeMap::new));

		Map<Integer, Integer> snakeMap = Arrays.stream(snakes)
				.collect(Collectors.toMap(kv -> kv[0], kv -> kv[1], (oldV, newV) -> newV,
						TreeMap::new));
		System.out.println("map items: " + ladderMap.toString());

		int rollsCounter = 0;
		int maxRoll = 6;
		int minRoll = 1;
		int spaceAfterMove = 1;
		List<Integer> movesList = new ArrayList<>();
		int boardsize = 100;
		while (spaceAfterMove < boardsize)
		{
			int spaceBeforeMove = spaceAfterMove;
			// check for last move
			if (spaceBeforeMove + maxRoll >= boardsize)
			{
				makeLastMove(spaceBeforeMove);
				break;
			}

			// find the next space that contains a ladder
			Integer ladderSpace = ladderMap.entrySet()
					.stream()
					.filter(map -> map.getKey()
							.intValue() > spaceBeforeMove)
					.map(Map.Entry::getKey)
					.findFirst()
					.orElse(boardsize);
			// if the ladder is < than max roll - add 1 to roll count
			// move to end ladder location

			if (ladderSpace - spaceBeforeMove <= maxRoll)
			{
				rollsCounter++;
				spaceAfterMove = ladderMap.get(ladderSpace);
				movesList.add(ladderSpace - spaceBeforeMove);
				continue;
			}
			// roll until you get to ladder space or end of board
			int spaces = 0;

			// newSpace = currentSpace;
			// Integer ladderSpace = ladderMap.entrySet().iterator().next().getKey();
			List<Integer> snakeSpaces;
			int snakeSpace = snakeMap.entrySet()
					.stream()
					.filter(map -> map.getKey()
							.intValue() > spaceBeforeMove)
					.map(Map.Entry::getKey)
					.findFirst()
					.orElse(boardsize);

			if (spaceBeforeMove < ladderSpace)
			{
				int tempRoll = maxRoll;
				// if you can get directly to a ladder... go there

				if (ladderSpace - spaceBeforeMove <= maxRoll)
				{
					rollsCounter++;
					spaceAfterMove = ladderMap.get(ladderSpace);
					System.out.println("used ladder: " + spaceBeforeMove);

					continue;
				}
				// calculate how many max rolls you can get

				for (int rollValue = maxRoll; rollValue <= 1; rollValue--)
				{

				}
			}

		}
		// go through the snakes - find if any start lower
		// find the fewest rolls to get to that - 1st start with 6
		// check if any rolls end on the start of a snake - remove or change that roll
		//
		return rollsCounter;
	}

	private static void makeLastMove(int spaceBeforeMove)
	{
		rollsCount++;
		movesList.add(boardSize - spaceBeforeMove);

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException
	{
		BufferedWriter bufferedWriter = new BufferedWriter(
				new FileWriter(System.getenv("OUTPUT_PATH")));

		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++)
		{
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int[][] ladders = new int[n][2];

			for (int i = 0; i < n; i++)
			{
				String[] laddersRowItems = scanner.nextLine()
						.split(" ");
				scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

				for (int j = 0; j < 2; j++)
				{
					int laddersItem = Integer.parseInt(laddersRowItems[j]);
					ladders[i][j] = laddersItem;
				}
			}

			int m = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int[][] snakes = new int[m][2];

			for (int i = 0; i < m; i++)
			{
				String[] snakesRowItems = scanner.nextLine()
						.split(" ");
				scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

				for (int j = 0; j < 2; j++)
				{
					int snakesItem = Integer.parseInt(snakesRowItems[j]);
					snakes[i][j] = snakesItem;
				}
			}

			int result = quickestWayUp(ladders, snakes);

			bufferedWriter.write(String.valueOf(result));
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}
}
