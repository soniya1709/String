package anagram;

public class FibonacciSeries {
public static void main(String[] args) {
	int n=10,a=0,b=0;
	int res=1;
	for(int i=0;i<=n;i++)
	{
		a=b;
		b=res;
		res=a+b;
		System.out.println(a);
	}
}
}
