public class DefineMethodsTest {
	public static void main(String[] args) {
		
		// 1. 
		DefineMethods dmethods;
		int abs;
		String jud;
		
		// 2. new
		dmethods = new DefineMethods();
		
		// 3. play
		// 1.
		System.out.println("absolute");
		abs = dmethods.absolute(2);
		System.out.printf("%d%n", abs);
		
		// 2.
		System.out.println();
		System.out.println("Multiple");
		dmethods.findMultipie(10);
		
		// 3.
		System.out.println();
		System.out.println("Sign");
		jud = dmethods.decidesign(0);
		System.out.printf("%s%n", jud);
		
		// 4.
		System.out.println();
		System.out.println("repeat");
		dmethods.repeatedMessage("world", 3);
		
		// 5.
		System.out.println();
		System.out.println();
		System.out.println("Circle");
		double result = dmethods.calcCircleArea(4);
		System.out.printf("%3.3f%n", result);
		
		// 6.
		System.out.println();
		System.out.println("MultipleNums");
		int[] mmn = dmethods.makeMultipleNums(10);
		for (int num : mmn) {
			System.out.printf("%d%n", num);
		}
	}
}