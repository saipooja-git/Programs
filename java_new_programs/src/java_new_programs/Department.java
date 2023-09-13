package java_new_programs;

public class Department {


		private int departmentId ;
		private String departmentName ;
		private String hod ;
		
		public Department() {
			departmentId = 1;
			departmentName = "Unknown";
			hod ="Unknown";	
	}
		public Department(int departmentId,String departmentName,String hod) {
			this.departmentId= departmentId;
			this.departmentName=departmentName;
			this.hod = hod;
		}
		public int getDepartmentId() {
			return departmentId;
		}
		public void setDepartmentId(int departmentId) {
			this.departmentId = departmentId;
		}
		public String getDepartmentName() {
			return departmentName;
		}
		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}
		public String getHod() {
			return hod;
		}
		public void setHod(String hod) {
			this.hod = hod;
		}
		
		public void displayHod(){
			System.out.println("calling  displayHODDetails method");
			System.out.println(" ");
			System.out.println("The HOD of the Department of "+getDepartmentName()+" is "+getHod());
			}
		
		

}
