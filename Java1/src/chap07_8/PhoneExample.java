package chap07_8;

public class PhoneExample {

	public static void main(String[] args) {
		//추상클래스는 new 연산자로 직접 생성자를 호출할 수 없다.
		//Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();

	}

}
