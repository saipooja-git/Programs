package java_new_programs;
// sub class
// super class  extends sub class

public class Students extends Person {
	
	private String collegeName;
	private int year;
	

		
	public Students(String collegeName,int year,String name,String email, String phoneNumber) {
	    // Call the constructor of the superclass (Person) using super()
		super(name,email,phoneNumber);
		this.collegeName=collegeName;
		this.year=year;
	}
	
	
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString() {
		// here by mentioning name as getName(), email as getEmail(),getPhoneNumber() so it will execute the person class methods  
		return String.format("collegeName -%s, year -%d, name - %s,email -%s,phoneNumber -%s",collegeName,year,getName(),getEmail(),getPhoneNumber());
	}
	
	
	

}
