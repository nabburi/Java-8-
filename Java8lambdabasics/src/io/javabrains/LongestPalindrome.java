package io.javabrains;

import java.util.Arrays;

public class LongestPalindrome {
	
	private static final String palString = "mohitatihom";
	private static final String palStringLong = "forgeeksskeegfor";
	private static boolean isPalindrome = false;
	
	public static void main(String[] args) {
		
		/*
		 * //check if string is plaindrome String subbString = palString; //substring(3,
		 * 13); int i = 0; int j = subbString.length()-1;
		 * 
		 * while(i < j) {
		 * 
		 * if(subbString.charAt(i) == subbString.charAt(j)) { isPalindrome = true; i++;
		 * j--; }else { isPalindrome = false; break; }
		 * 
		 * } System.out.println(isPalindrome);
		 */
	
		//Find longest palindrome
		int maxLength = 1;//this is the lenght of the longest palindrome string
		int start = 0;
		int len = palStringLong.length();
		int low;
		int high;
		
		//one by one consider every charecter as center point of even and odd length palindromes
		
		for(int i =1; i < len; ++i) {
			
			low = i-1;
			high = i;
			 // Find the longest even length palindrome with  
            // center points as i-1 and i. 
			while(low >= 0 && high < len  && palStringLong.charAt(low) == palStringLong.charAt(high)){
				if(high - low + 1 > maxLength) {
					start = low;
					maxLength = high -low +1 ;
				}
				//--low;
				//++high;
				low--;
				high++;
			}
			
			// Find the longest odd length palindrome with  
            // center point as i 
			low = i - 1;
			high = i + 1;
			while(low >= 0 && high < len && palStringLong.charAt(low)== palStringLong.charAt(high)) {
				if(high - low + 1 > maxLength) {
					start = low;
					maxLength = high - low + 1;
				}
				--low;
				++high;
			}
		}
		System.out.println(palStringLong.substring(start, start + maxLength));
	}

}
