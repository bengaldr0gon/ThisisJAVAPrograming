package review_ch0105;

import java.util.Scanner;

public class Value2 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Insert 1 ~ 10 Value :");
	int iValue1 = scanner.nextInt();
	System.out.println("Insert 1 ~ 10 Value :");
	int iValue2 = scanner.nextInt();
	System.out.println("Insert 1 ~ 10 Value :");
	int iValue3 = scanner.nextInt();
	int First = 0;
	int Second = 0;
	int Third = 0;
	
	if (iValue1 > iValue2) {
		if (iValue1 > iValue3) {
			First = iValue1;
			if(iValue2 > iValue3) {
				Second = iValue2;
				Third = iValue3;
			}else {
				Second = iValue3;
				Third = iValue2;
			}
		}else {
			First = iValue3;
			Second = iValue1;
			Third = iValue2;
		}
	}else if(iValue2 > iValue1){
		if (iValue2 > iValue3) {
			First = iValue2;
			if(iValue1 > iValue3) {
				Second = iValue1;
				Third = iValue3;
			}else {
				Second = iValue3;
				Third = iValue1;
			}
		}else {
			First = iValue3;
			Second = iValue2;
			Third = iValue1;
		}
		
	}
	
	System.out.printf("[First].%d [Second].%d [Third].%d", First, Second, Third);
		
	}
	

}
