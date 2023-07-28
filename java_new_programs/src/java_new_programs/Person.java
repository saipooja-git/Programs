package java_new_programs;
// super class
public class Person {
	private String name;
	private String email;
	private String phoneNumber;
	
	public Person(String name,String email, String phoneNumber) {
		this.name=name;
		this.email=email;
		this.phoneNumber=phoneNumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String toString() {
		return String.format("name - %s, email-%s, phoneumber-%s",name,email,phoneNumber);
	}
	
	

}
