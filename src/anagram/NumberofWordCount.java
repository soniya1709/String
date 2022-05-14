package anagram;

public class NumberofWordCount {
public static void main(String[] args) {
	String s="I am a java developer";
	String[] s1=s.split(" ");
	int count=0;
	for(int i=0;i<=s1.length-1;i++)
	{
		count++;
	}
	System.out.println(count);
}
}
