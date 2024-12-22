package ch07.practice.Q7;

public class Child extends Parent{
	public String name;
	
	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Chile(String name) call");
	}

}
