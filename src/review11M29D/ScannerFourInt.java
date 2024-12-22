package review11M29D;

import java.util.Scanner;

public class ScannerFourInt {

    final static int ARYLENGTH = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ScaFourInt = new int[ARYLENGTH];

        // 배열 입력받기
        for (int j = 0; j < ARYLENGTH; j++) {
            System.out.print("정수" + (j + 1) + " : ");
            ScaFourInt[j] = scanner.nextInt();
        }

        // 내림차순 정렬 로직 (버블 정렬)
        for (int j = 0; j < ARYLENGTH - 1; j++) {
            for (int k = 0; k < ARYLENGTH - 1 - j; k++) {
                if (ScaFourInt[k] < ScaFourInt[k + 1]) {
                    // 두 값 교환
                    int temp = ScaFourInt[k];
                    ScaFourInt[k] = ScaFourInt[k + 1];
                    ScaFourInt[k + 1] = temp;
                }
            }
        }

        // 정렬 결과 출력
        System.out.print("내림차순으로 정렬된 배열은 : ");
        for (int m = 0; m < ARYLENGTH; m++) {
            System.out.print(ScaFourInt[m] + " ");
        }

        scanner.close();
    }
}

