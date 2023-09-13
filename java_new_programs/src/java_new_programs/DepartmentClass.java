/**
 * 
 */
package java_new_programs;

public class DepartmentClass {

	
	public static void main(String[] args) {

		Department department = new Department();
		department.setDepartmentId(9947);
		department.setDepartmentName("Chemistry");
		department.setHod("Prof. Benjamin");
		System.out.println("Department ID:"+department.getDepartmentId());
		System.out.println("Department Name:"+department.getDepartmentName());
		System.out.println("HOD of the Department:"+department.getHod());
		department.displayHod();
		
	


	}

}

/**
Department ID:9947
Department Name:Chemistry
HOD of the Department:Prof. Benjamin
calling  displayHODDetails method
 
The HOD of the Department of Chemistry is Prof. Benjamin
**/