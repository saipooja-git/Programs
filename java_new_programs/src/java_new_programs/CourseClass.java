package java_new_programs;

public class CourseClass {

	public static void main(String[] args) {

		Course c = new Course();
		c.setCourseId(4461);
		c.setCourseName("Object Oriented Systems");
		c.setDepartment("Information Systems");
		c.setCredits(3);
		c.setInstructor("James Goshling");
		System.out.println("Course ID: "+c.getCourseId());
		System.out.println("Course Name: "+c.getCourseName());
		System.out.println("Department Offering the course: "+c.getDepartment());
		System.out.println("Credits: "+c.getCredits());
		System.out.println("Instructor: "+c.getInstructor());
		c.numOfCredits();
	}

}

/**
Course ID: 4461
Course Name: Object Oriented Systems
Department Offering the course: Information Systems
Credits: 3
Instructor: James Goshling
This Course is offered by Information Systems department and awarded with 3 credits.
**/