package anagram;

public class BasicOfString {
public static void main(String[] args) {
	String s="Balkrushna";
	s=s.toLowerCase();
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.contains("a")||s.contains("e")||s.contains("i")||s.contains("o")||s.contains("u")) {
			count++;
		}
	}
	System.out.println("number of vowel in String="+count);
}
}