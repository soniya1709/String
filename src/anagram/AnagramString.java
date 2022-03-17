package anagram;

import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args) {
		
	
	String s1="Listen";
	String s2="silent";
	
	s1=s1.toLowerCase();
	s2=s2.toLowerCase();
	
	if(s1.length()==s2.length())
	{
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
	
	
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("Given String is Anagram");
			
		}
		else
		{
			System.out.println("Given String is not anagram");
		}
	}
	
	}
}
