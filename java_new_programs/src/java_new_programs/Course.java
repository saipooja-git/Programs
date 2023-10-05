package java_new_programs;

public class Course {
	private int courseId;
	private String courseName;
	private String department;
	private String instructor;
	private int credits;
	
	public Course() {
		courseId = 1;
		courseName = "Unknown";
		department = "Unknown";
		instructor = "Unknown";
		credits = 0;
	}
	
	public Course(int courseId , String courseName , String department, String instructor,int credits) {
		this.courseId=courseId;
		this.courseName= courseName;
		this.department=department;
		this.instructor=instructor;
		this.credits=credits;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	public void numOfCredits() {
		System.out.println("This Course is offered by "+ getDepartment() + " department and awarded with "+ getCredits()+ " credits.");
	}
	

}
