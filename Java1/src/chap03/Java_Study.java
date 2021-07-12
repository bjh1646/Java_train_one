package chap03;

import java.util.Scanner;

public class Java_Study {

	public static void main(String[] args) {
		int c[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		 Scanner scanner = new Scanner(System.in);
		 while(true) {
		 System.out.print("금액을 입력해주세요(0을 넣으면 종료) : ");
		 int a = scanner.nextInt();
		 if(a==0) {
		 scanner.close();
		 break;
		 }
		 for(int i=0;i<c.length;i++) {
		 int b = a / c[i];
		 System.out.println(c[i]+"원 짜리 " + b);
		 a = a % c[i];
		 }
		 } 

	}

}
