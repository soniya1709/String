package anagram;

public class StringDivideIntoNequalpart {
public static void main(String[] args) {
	String s="BalKrushna";
	int n=3;
	int len=s.length();
	int part=len/n;
	for(int i=0;i<len;i=i+part)
	{
		System.out.println(s.substring(i,i+part));
	}
}
}
