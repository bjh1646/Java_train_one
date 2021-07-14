package chap05;

import java.text.DecimalFormat;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		
		int sum = 0;
		
		for(int i=0; i<scores.length; i++) {
			
			sum += scores[i];
		}
		
		System.out.println("총합 : " +sum);
		
		double avg = (double) sum / scores.length;
		
		DecimalFormat form = new DecimalFormat("#.####");
		
		System.out.println("평균 : " + avg);
		System.out.println(form.format(avg));

	}

}
