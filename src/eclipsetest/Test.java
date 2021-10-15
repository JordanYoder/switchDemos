package eclipsetest;

public class Test {

	//Cube
	public static void cubeNum(int num) {
		System.out.println(num + " cubed is " + (num * num * num));
	}

	// Percentage
	public static void percentage(double perc, int num) {
		System.out.println((int)perc + "% of " + num + " is " + (num * (perc / 100)));
	}
	
	// Square a number
	public static void squareNum(int num) {
		System.out.println(num + " squared is" + (num * num));
	}
	
	public static void main(String[] args) {
		int num = 4;
		double perc = 25;
		squareNum(num);
		cubeNum(num);
		percentage(perc, num);
	}

}
