/**
 * @(#)CompanyManger
 *
 * Company manager - ability to control employess, their salaries
 * 
 *
 * @author Mateusz Jakusz - HNCC - Programming
 * @version 1.00 2019/3/4
 */
import java.util.*;


public class CompanyManager {


	public static void main(String[] args) {
	
		// populating arraylist with 3 employees
		Employee lebron = new Employee(1, "LeBron James", 4300);
		Employee durant = new Employee(2, "Kevin Durant", 7500);
		Employee westbrook = new Employee(3, "Russel Westbrook", 3350.50);
		Employee leonard = new Employee(4, "Kawhi Leonard", 6829);
		Employee curry  = new Employee(5, "Stephen Curry", 9200);
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(lebron);
		employeeList.add(durant);
		employeeList.add(westbrook);
		employeeList.add(leonard);
		employeeList.add(curry);
		
		// displays menu to user
    	System.out.println(" PLEASE SELECT FROM 1-7 ");
    	System.out.println("1. Display all employees");
    	System.out.println("2. Add an employee");
    	System.out.println("3. Sort the employee ascending");
    	System.out.println("4. Sort the employee descending");
    	System.out.println("5. Remove an employee");
    	System.out.println("6. Display company finance and all salaries");
    	System.out.println("7. Exit the programme");
    	// setting a scanner to take input from user
		Scanner sc = new Scanner(System.in); 
		// initialized empty database (list)
		String[] database = new String[10000]; 
    	//initializing the menu choice system to handle user commands
		// setting a boolean variable that quits the menu
    	boolean quit = false; 
    	int menuItem;
    		do {
    			System.out.print("Choose menu item: ");
                 menuItem = sc.nextInt();
                  switch (menuItem) {
                  case 1:
                	  System.out.println(employeeList);
                        break;

                  case 2:
                	  	int size = employeeList.size();
  				    	int id = size+1;
  				    	System.out.print(" Enter employee name: ");
  				    	String name = sc.next();
  				    	System.out.print(" Enter salary (weekly) ");
  				    	double price = sc.nextDouble();
  				    	employeeList.add (new Employee(id, name, price));
						System.out.println("New Employee added to list");
                        break;

                  case 3:
                	  	Collections.sort(employeeList, Employee.EmployeeComparator);
                	  	System.out.println("Database sorted in ascending way:");
                        break;

                  case 4:
                	  Collections.sort(employeeList, Employee.EmployeeComparator2);
                	  	System.out.println("Database sorted in descending way:");
                        break;
                  case 5:
                	 
                	   System.out.println("Which employee would you like to remove ?");
                	   for (int i = 0; i<= employeeList.size(); i++) {
                		   System.out.println(i);
                	   }
                	   int choice = sc.nextInt();
                	   employeeList.remove(choice);
                	   System.out.println("Employee has been removed");
                	   
                  case 6:
                	  	double earning = 39758.52;
                	  	System.out.println("Company earns " + earning +" weekly");
                	  	double salaries = lebron.getSalary() + durant.getSalary() + westbrook.getSalary() + leonard.getSalary() + curry.getSalary();
                	  	System.out.println("Outgoings weekly are: " +salaries);
                	  	System.out.println("In a year company earns " +earning*52);
                	  	System.out.println("Yearly outgoings are: " + salaries*52);

             
                        break;
                  case 7:
                	  // setting a boolean to true for quiting the menu
                      quit = true; 
                      break;
                      
                      // prevents user from choosing wrong option 
                  default: 

                        System.out.println("Invalid choice. Please try again selecting the option 1-9");

                  }

            } while (!quit);
            // menu ENDS
            System.out.println("Thank you so much for using my program!");


	}

}
