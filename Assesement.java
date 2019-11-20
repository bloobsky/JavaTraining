/**
 * @(#)Assesement.java
 *
 * assesement - simple menu with 2 various options to ascend/descend to sort, efficiency test (performance) and ability to see the list
 *
 * @author Mateusz Jakusz
 * @version 1.00 2018/12/4
 */

import java.util.*; // importing all classes required for project

public class Assesement {
	static int size = 0;
    public static void main(String[] args) {
    	// printing the menu
    	System.out.println(" PLEASE SELECT FROM 1-9 ");
    	System.out.println("1. Add a name to the list");
    	System.out.println("2. Sort the list ascending using insertion sort");
    	System.out.println("3. Sort the list descending using insertion sort");
    	System.out.println("4. Sort the list ascending using built-in Java method");
    	System.out.println("5. Sort the list descending using built-in Java method");
    	System.out.println("6. Display the list");
    	System.out.println("7. Populate the database with random 100000 entries");
    	System.out.println("8. Run efficiency test");
    	System.out.println("9. Exit the programme");

		Scanner sc = new Scanner(System.in); // setting a scanner to take input from user
		String[] database = new String[10]; // initializind empty database (list)

    	//initializing the menu choice system to handle user commands
    	boolean quit = false; // seting a boolean variable that quits the function
    	int menuItem;
    		do {
		//	System.out.print(data.length);
               System.out.print("Choose menu item: ");
                 menuItem = sc.nextInt();
                  switch (menuItem) {
                  case 1:
					    addName(database);
                        break;

                  case 2:
						insertionSortAsc(database);
                        break;

                  case 3:
						insertionSortDsc(database);
                        break;

                  case 4:
						javaSortAsc(database);
						System.out.println("Database sorted in ascending way:");
                        break;

                  case 5:
						javaSortDsc(database);
						System.out.println("Database sorted in descending way:");

                        break;
                  case 6:
						displayList(database);


                       break;
                  case 7:
						autoPopulate(database);


                       break;
                  case 8:
					//	bubbleSortAsc(database);
					//	bubbleSortDsc(database);
					//	javaSortAsc(database);
					//	javaSortDsc(database);
                       break;
                  case 9:

                        quit = true; // setting a boolean to true for quiting the menu
                        break;

                  default: // prevent user from choosing wrong option

                        System.out.println("Invalid choice. Please try again selecting the option 1-9");

                  }

            } while (!quit);
            // menu ENDS
            System.out.println("Thank you so much for using my program!");

    }
public static void addName(String[] data){
	if(size >= data.length) {
		System.out.println("Database too big"); // protection for overwrite
		return;
	}

	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the name you want to add to the list");
	String name = sc.next();
	data[size]=name;
	size++;
}


public static void javaSortAsc(String[] data) {
	Arrays.sort(data);
}
public static void javaSortDsc(String[] data){
	Arrays.sort(data, Collections.reverseOrder());

}
public static void insertionSortAsc (String[] data) {
	String temp; // temp variable for single array entry
          for(int i = 1; i < data.length; i++) {
               temp = data[i];
               int j = 0;
               for(j = i; j > 0; j--) {
                   if(temp.compareTo(data[j - 1]) < 0) {
                         data[j] = data[j - 1];
                    }
                    else {
                    break;
                    }

          	   }
               data[j] = temp;
          }
}

public static void insertionSortDsc (String[] data) {
	String temp; // temp variable for single array entry
          for(int i = 1; i < data.length; i++) {
               temp = data[i];
               int j = 0;
               for(j = i; j < data.length; j++) {
                   if(temp.compareTo(data[j + 1]) < 0) {
                         data[j] = data[j + 1];
                    }
                    else {
                    break;
                    }

          	   }
               data[j] = temp;
          }
}

public static void displayList(String[] data) {
	System.out.println("Displaying database:");
	for(int i= 0; i < data.length; i++) { // using for loop to print data inside list
		System.out.println(data[i]);
	}
}

public static void autoPopulate(String[] data) {
	//for(i =0; i < data.length; i++) {
		// data[i] = "" + (int)(math.random()* 10000);
	}
	//System.out.println("Database populated with random entries.");

}


}
