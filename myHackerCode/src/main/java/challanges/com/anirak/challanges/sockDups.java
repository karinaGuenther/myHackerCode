/**
 * 
 */
package com.anirak.challanges;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Owner
 *
 */
public class sockDups {

	private static final Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(
				new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++)
		{
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = sockMerchant(n, ar);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}

	/**
	 * @param <T>
	 * @param n
	 * @param ar
	 * @return
	 */
	private static int sockMerchant(int n, int[] ar) {
		Set<Integer> set = new HashSet<>();
	        int dups = 0;
	       for (int sock : ar) 
	        { 
	    	   if (set.add(sock) == false) 
	        { 
	    		   dups++;
				set.remove(sock);
	        } 
	    	   }
	        return dups;
		
	}


}
