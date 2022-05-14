package Immutableclass;

public class Address {
int pin;
String city;
String country;
public Address() {
	super();
}
public Address(int pin, String city, String country) {
	super();
	this.pin = pin;
	this.city = city;
	this.country = country;
}
public int getPin() {
	return pin;
}
public String getCity() {
	return city;
}
public String getCountry() {
	return country;
}
public void setPin(int pin) {
	this.pin = pin;
}
public void setCity(String city) {
	this.city = city;
}
public void setCountry(String country) {
	this.country = country;
}
@Override
public String toString() {
	return "Address [pin=" + pin + ", city=" + city + ", country=" + country + "]";
}

}
