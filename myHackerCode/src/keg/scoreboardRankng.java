package keg;
/**
 * 
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;




/**
 * @author Owner
 *
 */
public class scoreboardRankng {

	private static final Logger log = Logger.getLogger(scoreboardRankng.class.getName());
	// Complete the climbingLeaderboard function below.
	static int[] climbingLeaderboard(int[] scores, int[] alice) {
		int currentrank = 1;
		int[] rankArray = alice.clone();
		for(int aliceScore : alice)
		{
			int currRank = 0;
			for (int score : scores)
			{
				currRank++;
				if (aliceScore >= score)
				{
					// Arrays.asList(a).indexOf(target);
					rankArray[Arrays.asList(alice).indexOf(aliceScore)] = currRank;
					break;
				}
			}
		}
		
		
		/*
		 * take alice scores and find where each ranks on the board
		 */
		// convert to int array
		// int[] rank = rankedList.stream().mapToInt(Integer::intValue).toArray();
		return rankArray;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		log.info("user dir: " + System.getProperty("user.dir"));
		BufferedWriter bufferedWriter = new BufferedWriter(
				new FileWriter(
						"D:\\myProgramming\\workspace\\HackerTests\\src\\resources\\testOutput.txt",
						false));

		int scoresCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		log.info("scores count: " + scoresCount);

		int[] scores = new int[scoresCount];

		String[] scoresItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		log.info("scores: " + scores);
		for (int i = 0; i < scoresCount; i++)
		{
			int scoresItem = Integer.parseInt(scoresItems[i]);
			scores[i] = scoresItem;
		}

		int aliceCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		log.info("alice " + aliceCount);
		int[] alice = new int[aliceCount];

		String[] aliceItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		log.info("allice items: " + aliceItems);
		for (int i = 0; i < aliceCount; i++)
		{
			int aliceItem = Integer.parseInt(aliceItems[i]);
			alice[i] = aliceItem;
		}

		int[] result = climbingLeaderboard(scores, alice);

		for (int i = 0; i < result.length; i++)
		{
			bufferedWriter.write(String.valueOf(result[i]));

			if (i != result.length - 1)
			{
				bufferedWriter.write("\n");
			}
		}

		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}

}
