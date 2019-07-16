public class DefineMethods {
	// 1. 
	public int absolute(int x) {
		int abs = (x > 0) ? x : -x;
		// return
		return abs;
	}
	
	// 2.
	public void findMultipie(int x) {
		int idx = 1;
		// == idx <= 100/x
		while (x * idx <= 100) {
			System.out.printf("%d%n", x * idx);
			idx++;
		}
	}
	
	// 3.
	public String decidesign(int x) {
		String jud;
		if (x < 0) {
			jud = "minus";
			
		} else if (x == 0) {
			jud = "zero";
			
		} else {
			jud = "plus";
		}
		return jud;
	}

	// 4.
	public void repeatedMessage(String message, int repeat) {
		
		// String [] Messages;
		// String [] array
		// String [] numbers
		String [] Messages;
		Messages = new String[repeat];
		for (int idx = 0; idx < Messages.length; idx++) {
			Messages[idx] = message;
		} for (String mes : Messages) {
			System.out.printf(mes);
		}
	}
	
	// 5.
	public double calcCircleArea(int r) {
		return 3.14 * r * r;
	}
	
	// 6 .
	public int[] makeMultipleNums(int x) {
		int[] mmn;
		int leg = 0;
		int idx = 1;
		while (x * idx <= 100) {
			leg = idx;
			idx++;
		}
		// int[] multiples = new int[100 / x]; 
		mmn = new int[leg];
		for (idx = 0; idx < mmn.length; idx++) {
			mmn[idx] = x * (idx + 1);
		}
		return mmn;
	}
}