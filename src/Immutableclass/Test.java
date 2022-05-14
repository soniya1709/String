package Immutableclass;

public class Test {
public static void main(String[] args) {
	Address addr=new Address(1234,"pune","India");
	Student s=new Student(10,"Ram",addr);
	
	System.out.println("Original s"+s);
	addr.setCity("Mumbai");
	System.out.println("changed s"+s);
}
}
