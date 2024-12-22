package ch07.sec10.exam01;

public class SmartPhone extends Phone {
	
	SmartPhone(String owner) {
		
		super(owner); // 부모의 생성자 호출 super : phone을의미
	}
	
	void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

}
