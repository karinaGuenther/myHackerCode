package keg;

/**
 * 
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Owner
 *
 */
public class queenMoves {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(
				new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0]);

		int k = Integer.parseInt(nk[1]);

		String[] r_qC_q = scanner.nextLine().split(" ");

		int r_q = Integer.parseInt(r_qC_q[0]);

		int c_q = Integer.parseInt(r_qC_q[1]);

		int[][] obstacles = new int[k][2];

		for (int i = 0; i < k; i++)
		{
			String[] obstaclesRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 2; j++)
			{
				int obstaclesItem = Integer.parseInt(obstaclesRowItems[j]);
				obstacles[i][j] = obstaclesItem;
			}
		}

		int result = queensAttack(n, k, r_q, c_q, obstacles);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}

	/**
	 * @param  n
	 * @param  k
	 * @param  r_q
	 * @param  c_q
	 * @param  obstacles
	 * @return
	 */
	private static int queensAttack(int boardSize, int obstacleCount, int queenRow, int queenCol,
			int[][] obstacles) {
		// convert 2d array to 2d list
		// data is int[][]
		/*
		 * List<List<Integer>> list = Arrays.stream(obstacles) .map(row ->
		 * IntStream.of(row).boxed().collect(Collectors.toList()))
		 * .collect(Collectors.toList());
		 */
		int queenLocation = queenRow * 10 + queenCol;
		int minRow = 0;
		int maxRow = boardSize;
		int maxCol = boardSize;
		int maxLoc = 10 * boardSize + boardSize;
		List<int[]> rowColList = Arrays.asList(obstacles);
		// List<Integer>
		// objectList =
		rowColList.forEach(row ->
		{
			int col = 0;
		});
		System.out.println("object lsit: " + rowColList.toString());
		/**
		 *
		 * queen move up: r-1, c=c
		 */
		// for(outLoop = 0;outLoop<)
		/*
		 * queen move right up: r-1, c+1 queen move right: r=r, c+1 queen move right
		 * down: r+1, c+1; queen move down: r+1, c=c; queen move left down: r+1, c-1;
		 * queen move left: r=r, c-1;
		 */
		// List<E>()
		// queen move sideways count
		// for(int row:obstacles)
		// queen move diagonally up left: r-1, c-1
		// for()

		return 0;
	}

	private static void name() {

	}
}
