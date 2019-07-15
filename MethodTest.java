public class MethodTest {
	
	public static void main(String[] args) {
		
		// 1. var declare of MethodDefinitions
		MethodDefinitions methods;
		
		// 2. var initiation
		methods = new MethodDefinitions();
		
		// 3.  method call

		// 1.
		methods.printTenTimes(1);
		
		// 2.
		methods.printSomebodysMessage("dejawa", "good");
		
		// 3.
		methods.printMessage("good");
		
		// 4.
		String message = methods.returnOriginalMessage("fuck");
		System.out.printf("%s%n",message);
		
		// 5.
		int result = methods.addTen(10);
		System.out.printf("%d%n",result);
		
		// 6.
		int result1 = methods.subtractTen(20);
		System.out.printf("%d%n",result1);
		
		// 7.
		double result2 = methods.makeDouble(10);
		System.out.printf("%2.1f%n",result2);
		
		// 8.
		double result3 = methods.subtracFivePointFive(10);
		System.out.printf("%2.1f%n",result3);
		
		// 9.
		String fullname = methods.makeFullName("min", "Lee");
		System.out.printf("%s%n",fullname);
		
		// 10.
		int result4 = methods.add(10, 20);
		System.out.printf("%d%n", result4);
		
		// 11.
		double result5 = methods.add(10.0, 20.0);
		System.out.printf("%3.1f%n", result5);
		
		// 12.
		methods.printMsgManyTimes("double", 3);
		
		// 13.
		methods.arithmetic('+',10,20);
		
	    // 14.
		double result6 = methods.arithmetic('+',10.0,20.0);
		System.out.printf("%3.1f%n", result6);
		
		// 15.
		boolean jud = methods.isEven(4);
		System.out.printf("%b%n", jud);
	}

}
