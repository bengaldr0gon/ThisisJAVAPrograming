package ch09.sec03.exam02;

public class AExample {

	public static void main(String[] args) {
		A.B b = new A.B();
		//정적 클래스이므로 A객체를 생성할 필요가 없음
		//여기서 A는 접근 경로(?)를 뜻함.
		
		System.out.println(b.field1);
		b.method1();
		
		System.out.println(A.B.field2);
		A.B.method2();
		
		
	}

}
