/**
 * 
 */
package com.anirak.jtests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.anirak.challanges.kStringUtils;

/**
 * @author Owner assertTrue(test) assertTrue("message", test)
 */
class TestStringUtils
{

	/**
	 * Test method for
	 * {@link keg.challanges.kStringUtils#reverseString(java.lang.String)}.
	 */
	@Test
	void testReverseString()
	{
		String myString = "this is my string to reverse";
		String reversed = "esrever ot gnirts ym si siht";

		assertEquals(reversed, kStringUtils.reverseString(myString));
		String oddString = "odd";
		String even = "even";
		reversed = "ddo";
		assertEquals(reversed, kStringUtils.reverseString(oddString));
		reversed = "neve";
		assertEquals(reversed, kStringUtils.reverseString(even));
	}

}
