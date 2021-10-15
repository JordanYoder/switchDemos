package eclipsetest;
import java.util.Scanner;

public class MoreSwitchDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please select 1, 2, or 3");
		System.out.println();
		int userChoice = scan.nextInt();
		getUserChoice(userChoice);
		
		scan.close();
	}
	
	public static void getUserChoice(int userChoice) {
		switch(userChoice) {
			case 1:
				System.out.println("Chosing Riker is always a good choice");
				break;
			case 2:
				System.out.println("How very middle of the road of you");
				break;
			case 3:
				System.out.println("Omega, huh? Like living on the edge of what is possible");
				break;
			default:
				System.out.println("Rule breaker huh? I like that");
		}	
	}
}
