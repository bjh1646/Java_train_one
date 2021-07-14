package chap05;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		String strVar1 = "배지혁";  // 내용이 같고 변수명이 다르면
		String strVar2 = "배지혁";  // 그 주소는 모두 동일함.

		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals((strVar2))) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		
		String strVar3 = new String("배지혁");  // new는 하나의 묶음이므로
		String strVar4 = new String("배지혁");  // 3,4의 "배지혁"은 참조가 다르다.
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals((strVar4))) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
	}

}
