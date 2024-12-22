package review11M22D;

import java.util.Scanner;

public class CalTwoValue {

	public static void main(String[] args) { // 2수를 입력받아 사칙연산
		Scanner scanner = new Scanner(System.in); 
		
		int value1;
		int value2;
		String cal;
		boolean repeat = false;
		String quite;
		
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
