package ch09.sec04.exam01;

public class A {
	
	A() {
		
		class B {}
		
		B b = new B();
	}
	
	void method() {
		
		class B {} 
		//로컬 클래스 
		
		B b = new B();
		//로컬 객체 생성
	}

}
