package anagram;

import java.util.Arrays;

public class ReverseStringWithoutReversemethod {
public static void main(String[] args) {
	String s="soniya";
	System.out.println("original string= "+s);
	String[] s1=s.split("");
	
	for(int i=s1.length-1;i>=0;i--)
	{
		
	System.out.println(s1[i].toString());
	}
	
}
}
