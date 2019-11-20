import java.util.Comparator;

// external class for Company manager
// author: Mateusz Jakusz

public class Employee {
	
	private int id;
	private String name;
	private double salary;

	public Employee (int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	// return id when requested
	public int getId() {
		return id;
	}
	// return name when requested
	public String getName() {
		return name;
		
	}
	// return price when requested
	public double getSalary() {
		return salary;
	
	}
	
	
	// compares 2 strings together and return them in ascending order
	public String toString() {
	        return "Employee: " + name + " Salary: " +salary ;
	   }
	 public static Comparator<Employee> EmployeeComparator = new Comparator<Employee>() {

		 	public int compare(Employee s1, Employee s2) {
			String EmployeeName1 = s1.getName().toUpperCase();
			String EmployeeName2 = s2.getName().toUpperCase();

			   //ascending order
			 return EmployeeName1.compareTo(EmployeeName2);


		 		}};
		 	// compares 2 strings together and return them in descending order	 		
		public static Comparator<Employee> EmployeeComparator2 = new Comparator<Employee>() {

			 public int compare(Employee s1, Employee s2) {
			 String EmployeeName1 = s1.getName().toUpperCase();
			 String EmployeeName2 = s2.getName().toUpperCase();

		   //descending order
				   return EmployeeName2.compareTo(EmployeeName1);


			 		}};
}
 

