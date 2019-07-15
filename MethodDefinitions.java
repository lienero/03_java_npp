public class MethodDefinitions {
	
	// 1.
	public void printTenTimes(int input) {
		for (int idx = 1; idx <= 10; idx++) {
			System.out.printf("%d%n", input);
			input += 10;
		}
	}
	
	// 2. 
	public void printSomebodysMessage(String message, String name) {
		System.out.printf("%s is message : %s%n",message, name);
	}
	
	// 3.
	public void printMessage(String message) {
		System.out.printf("%s%n",message);
	}
	
	// 4.
	public String returnOriginalMessage(String message) {
		return message;
	}
	
	// 5.
	public int addTen(int input){
		return input + 10;
	}
	
	// 6.
	public int subtractTen(int input){
		return input - 10;
	}
	
	// 7.
	public double makeDouble(double input){
		return input * 2;
	}
	
	// 8.
	public double subtracFivePointFive(double input){
		return input - 5.5;
	}
	
	// 9.
	public String makeFullName(String name, String surname) {
		return surname + name;
	}
	
	// 10.
	public int add(int x, int y) {
		return x + y;
	}
	
	// 11.
	public double add(double x, double y) {
		return x + y;
	}
	
	// 12.
	public void printMsgManyTimes(String message, int input) {
		for (int idx = 1; idx <= input; idx++) {
			System.out.printf("%s%n", message);
		}
	}
	
	// 13.
	public void arithmetic(char operator, int x, int y) {
		switch(operator) {
			case '+' :
			System.out.printf("%d + %d = %d%n", x, y, x + y);
			break;
			case '-' :
			System.out.printf("%d - %d = %d%n", x, y, x - y);
			break;
			case '*' :
			System.out.printf("%d * %d = %d%n", x, y, x * y);
			break;
			case '/' :
			System.out.printf("%d / %d = %d%n", x, y, x / y);
			break;
		}
	}
	
	// 14.

	public double arithmetic(char operator, double x, double y) {
		double result = 0;
		switch(operator) {
			case '+' :
			result = x + y;
			break;

			case '-' :
			result = x - y;
			break;

			case '*' :
			result = x * y;
			break;

			case '/' :
			result = x / y;
			break;
		}
		return result;
	}	
	
	public boolean isEven(int input) {
		boolean result;
		
		if (input %2 == 0) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
	
	
}