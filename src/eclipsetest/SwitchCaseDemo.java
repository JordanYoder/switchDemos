package eclipsetest;
import java.util.Scanner;

public class SwitchCaseDemo {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("1. Add a student");
		System.out.println("2. Remove a student");
		System.out.println("3. Update a student");
		System.out.println("4. List all students");
		System.out.println("5. Exit");
		
		System.out.println();
		System.out.println("Enter your menu option");
		int userInput = scanner.nextInt();
		menuProcessing(userInput);
		
		
		//System.out.println(userInput);
		scanner.close();
	}
	
	public static void menuProcessing(int userInput) {
		switch(userInput) {
		case 1:
			System.out.println("Add a student option is selected");
			break;
		case 2:
			System.out.println("Remove a student");
			break;
		case 3:
			System.out.println("Update a student");
			break;
		case 4:
			System.out.println("List all students");
			break;
		case 5:
			System.exit(0);
		}
	}

}
