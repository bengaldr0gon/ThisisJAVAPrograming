package review11M29D;

import java.util.Scanner;

public class CalClass {
	
	public int value1;
	public int value2;
	public String cal;
	public boolean repeat = false;
	public String quite;
	
	
	public void Calculator (){
		Scanner scanner = new Scanner(System.in);
		
		while(!repeat) {
			System.out.println("계산기를 실행합니다. 계속하려면 아무키나, 종료하려면 q를 입력하십시오");
			quite = scanner.next();
			
			if(quite.equals("q")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.print("정수 1: ");
				value1 = scanner.nextInt();
				
				System.out.print("연산자: ");
				cal = scanner.next();
				
				System.out.print("정수 2: ");
				value2 = scanner.nextInt();
				
				switch (cal) {
				case "+" -> System.out.println(value1 + value2);
				case "-" -> System.out.println(value1 - value2);
				case "*" -> System.out.println(value1 * value2);
				case "/" -> System.out.println(value1 / value2);
				default -> System.out.println("올바른 연산자를 입력해주십시오.");
				}
			}
		}
		scanner.close();
	}

}
