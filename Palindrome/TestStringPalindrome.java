package Palindrome;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStringPalindrome {

	@Test
	public void test() {
		assertEquals(PalindromeString.isPalindrome("abcba"),true);
		assertEquals(PalindromeString.isPalindrome("xyzij"),false);
		assertEquals(PalindromeString.isPalindrome(""),false);
		
	}

}
