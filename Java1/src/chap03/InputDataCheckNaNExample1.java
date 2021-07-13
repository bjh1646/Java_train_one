package chap03;

public class InputDataCheckNaNExample1 {

	public static void main(String[] args) {
		String userInput = "NaN";  // 5 % 0.0
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		currentBalance += val;  // -> 10000 + NaN
		System.out.println(currentBalance);
	}

}
