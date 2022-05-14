package anagram;

public class StringReverse {
public static void main(String[] args) {
	String str="Soniya sabale";
	StringBuffer bf=new StringBuffer(str);
	System.out.println("Original string= "+bf);
	StringBuffer s=bf.reverse();
	System.out.println("Reverse string= "+s);
}
}
