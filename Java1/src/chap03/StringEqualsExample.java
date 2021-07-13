package chap03;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "배지혁";
		String strVar2 = "배지혁";
		String strVar3 = new String("배지혁");
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println();
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));

	}

}
