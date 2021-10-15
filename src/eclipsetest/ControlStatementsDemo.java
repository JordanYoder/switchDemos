package eclipsetest;

public class ControlStatementsDemo {

	public static void main(String[] args) {
		findOddEven(10);
		System.out.println(insCheck(4000));
	}

	// This method prints whether a number is odd or even
	public static void findOddEven(int myNum) {
		int result = myNum % 2;
		
		if (result == 0) {
			System.out.println("The number is even");
		} else {
			System.out.println("The number is odd");
		}
	}
	
	public static String insCheck(int salary) {
		String insCategory;
		//5k 7k
		if(salary >= 5000 && salary <= 7000) {
			insCategory = "Class one insurance";
		} else if (salary > 7000 && salary <= 9000) {
			insCategory = "Class two insurance";
		} else if (salary > 9000 && salary <= 11000) {
			insCategory = "Class three insurance";
		} else {
			insCategory = "No insurance";
		}
		
		return insCategory;
	}

}
