package chap05;

public class Grade2 {

	public static void main(String[] args) {
		int jumsu = 92;
		
		int gr = jumsu/10;
		
		switch(gr) {
		
		case 10 :
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
