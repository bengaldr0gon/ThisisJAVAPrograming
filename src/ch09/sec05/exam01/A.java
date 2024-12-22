package ch09.sec05.exam01;

public class A {
	
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B {
		// 일반 클래스에서는 바깥 클래스의 모든 멤버를 사용할 수 있음
		void method() {
			field1 = 10;
			method1();
			field2 = 16;
			method2();
		}
	}
	
	static class C {
		//정적 클래스에서 바깥 클래스의 필드 중 사용할 수 있는 멤버는 정적으로 선언된 것 뿐이다.
		void method() {
			field2 = 10;
			method2();
		}
	}

}
