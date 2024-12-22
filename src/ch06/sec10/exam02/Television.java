package ch06.sec10.exam02;

public class Television {
	//필드 선언
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;
	
	static {
		info = company + "-" + model;
	}

}
