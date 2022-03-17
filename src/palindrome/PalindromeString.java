package palindrome;

public class PalindromeString {
	static String isPalindrome(String s)
	{
		String reversestr="";
		for(int i=(s.length()-1);i>=0;i--)
		{
			reversestr=reversestr+s.charAt(i);
		}
		if(s.toLowerCase().equals(reversestr.toLowerCase()) )
		{
			System.out.println("Given String is Palindrom="+s);
		}
		else
		{
			System.out.println("Given String is not palindrome="+s);
		}
		return s;
	}
	
public static void main(String[] args) {
	String str="Radar";
	isPalindrome(str);
}
}
