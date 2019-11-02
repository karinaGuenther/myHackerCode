package keg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author Owner
 *
 */
public class sample {
	public static void main(String[] args) throws IOException {
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
		// System.out.println("odds = " + primes);
	}
}
