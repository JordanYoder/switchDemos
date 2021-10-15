package eclipsetest;

public class LoopingDemo {

	public static void main(String[] args) {
		whileDemo();

	}
	
	public static void whileDemo() {
		int i = 0;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
	}

}
