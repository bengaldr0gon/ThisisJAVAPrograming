package ch06.Account20;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		
		Account Account = new Account();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			Account.Choose();
			if(Account.inputnum <= 5) {
				if(Account.inputnum !=5) {
					Account.ChooseNum(Account.inputnum);
				}else {
					Account.off();
					break;
				}
				
			} else {
				System.out.println("올바른 번호를 골라주세요");
			}	
		}
		
		scanner.close();
	}

}
 	