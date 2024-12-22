package review11M22D;

import java.util.Scanner;

public class Value4 {

	public static void main(String[] args) {// 4개의 정수를 입력받아 크기가 큰 순서대로 출력
		Scanner scanner = new Scanner(System.in);
		InputSort sortarray = new InputSort();
		
		int[] value = new int [4];
		for (int i = 0; i < value.length; i++) {
            System.out.print("정수 " + (i + 1) + ": ");
            value[i] = scanner.nextInt();
        }
		
		sortarray.sort(value);
		
		 for (int i = 0; i < value.length; i++) {
	            System.out.print(value[i] + " ");
	      }

		scanner.close();
		

	}

}
