package Palindrome;

public class PalindromeString {

public static boolean isPalindrome(String str1) {
	
		if(str1 == null || str1.isEmpty()){
	        return false;
	    }
 		int len = str1.length();
	    for( int i = 0; i < len/2; i++ ){
	        if (str1.charAt(i) != str1.charAt(len-i-1)){
	        	return false;
	        }
	    }
	    return true;    
	}
	
}
