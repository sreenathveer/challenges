import java.util.Scanner;


public class ReverseString {
	
	public static String reverse(String str)
	{
		char charAry[] = str.toCharArray();
		
		 if(str == null || str.isEmpty()){
		        return "Empty String";
		    }
		 

		    char[] charArr = new char[str.length()];
		    int count = 0;
		    for (int i = str.length() - 1; i >= 0; i--) {
		        charArr[count] = str.charAt(i);
		        count++;
		    }
		    return new String(charArr);
		
	}

}
