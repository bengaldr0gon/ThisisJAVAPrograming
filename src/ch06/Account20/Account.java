package ch06.Account20;

import java.util.Scanner;

public class Account {
	public static int MIN_CNUM = 1;
	public static int MAX_CNUM = 5;
	
	Scanner scanner = new Scanner(System.in);
	
	public int inputnum;
	public int cnum;
	public String Anum;
	public String Aowner;
	public int Abgmoney;
	public int Ademoney;
	public String [][] Alist = new String[100][3];
	public int Ano;

	
	public Account() {}
	
	public void Choose() {  // 기능 선택
		
		while(true) {
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택>");
			inputnum = scanner.nextInt();
			
			if (inputnum >= MIN_CNUM && inputnum <= MAX_CNUM) {
				this.cnum = inputnum;
				break;
			} else {
			}
			
		}
	}
	
	public void ChooseNum(int inputnum) {
		switch(inputnum) {
			case 1 -> this.CreateAccount();
			
			case 2 -> this.ListAccount();
			
			case 3 -> this.Desposit();
			
			case 4 -> this.Withdrawal();
			
			default -> this.off();
		}
	}
	
	public void CreateAccount() {
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		
		System.out.print("계좌번호: ");
		Anum = scanner.next();
		System.out.print("계좌주: ");
		Aowner = scanner.next();
		System.out.print("초기입금액: ");
		Abgmoney = scanner.nextInt();
		System.out.println("결과: 계좌가 생성되었습니다.");
		++Ano;
		Alist[Ano][0] = Anum + "   ";
		Alist[Ano][1] = Aowner + "   ";
		Alist[Ano][2] = Abgmoney + "   ";
	}
	
	public void ListAccount() {
		System.out.println("------");
		System.out.println("계좌목록");
		System.out.println("------");
		for(int j=1; j<Alist.length - 1; j++) {
			for(int i=0; i<3; i++) {
				if(Alist[j][i]!=null && Alist[j][i]!="") {
					System.out.print(Alist[j][i]);
				}
			}
			System.out.println("");
		}
	}
	
	public void Desposit() {
		System.out.println("------");
		System.out.println("예금");
		System.out.println("------");
		System.out.print("계좌번호: ");
		Anum = scanner.next();
		System.out.print("예금액: ");
		Ademoney = scanner.nextInt();
		
	}
	
	public void Withdrawal() {
		System.out.println("------");
		System.out.println("출금");
		System.out.println("------");
		System.out.print("계좌번호: ");
		Anum = scanner.next();
		System.out.print("출금액: ");
		Ademoney = scanner.nextInt();
		System.out.println("결과: 출금이 성공되었습니다.");
	}
	
	public void off() {
		System.out.println("프로그램 종료");
	
	}

}
