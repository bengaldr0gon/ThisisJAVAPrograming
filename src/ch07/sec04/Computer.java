package ch07.sec04;

public class Computer extends Calculator{
	
	@Override //컴파일러에게 오버라이드라는 지시(정확한 메서드 재정의 표시)
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 arearCircle() 실행");
		return Math.PI * r * r;
	}

}
