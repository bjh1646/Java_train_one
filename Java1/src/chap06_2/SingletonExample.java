package chap06_2;

public class SingletonExample {

	public static void main(String[] args) {
		
		/*
		 * Singleton obj1 = new Singleton(); //컴파일 에러
		 * Singleton obj2 = new Singleton();
		 */
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("싱글톤이다.");
		} else {
			System.out.println("싱글톤이 아니다.");
		}

	}

}
