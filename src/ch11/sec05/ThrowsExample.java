package ch11.sec05;

public class ThrowsExample {

	public static void main(String[] args) {
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 없습니다.");
		}

	}
	
	public static void findClass() throws ClassNotFoundException{
			Class.forName("java.lang.String2");
		
	}

}
