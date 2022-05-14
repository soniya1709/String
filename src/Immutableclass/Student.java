package Immutableclass;

public final class Student {

	private final int roll;
	private final String name;
	private final Address addr;
	
	public Student(int roll, String name, Address addr) {
		super();
		this.roll = roll;
		this.name = name;
		Address add=new Address();
		add.setPin(addr.getPin());
		add.setCity(addr.getCity());
		add.setCountry(addr.getCountry());
		this.addr=add;
				
	}
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public Address getAddr() {
		Address address=new Address();
		address.setPin(this.addr.getPin());
		address.setCity(this.addr.getCity());
		address.setCountry(this.addr.getCountry());
		return address;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", addr=" + addr + "]";
	}
	
}
