package chap05;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		
		int jumsu;
		Scanner in = new Scanner(System.in);
		System.out.print("당신의 점수는? : ");
		
		jumsu = in.nextInt();
		
		System.out.print("당신의 학점은 : ");
		
		switch(jumsu/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default :
			System.out.println("F");
			
			
				
		}
		
		
	}

}
