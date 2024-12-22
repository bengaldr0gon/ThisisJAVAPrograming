package review_ch0105;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] rarray = new int[10];
        int i = 1; // 두 번째 인덱스부터 시작
        int temp;

        // 첫 번째 인덱스에 1~10 중 무작위 숫자를 넣음
        rarray[0] = (int)(Math.random() * 10) + 1;

        // 배열의 나머지 부분을 채우기
        while (i < rarray.length) {
            temp = (int)(Math.random() * 10) + 1;
            boolean isDuplicate = false;

            // 중복 검사
            for (int j = 0; j < i; j++) {
                if (rarray[j] == temp) {
                    isDuplicate = true;
                    break;
                }
            }

            // 중복이 없으면 배열에 추가
            if (!isDuplicate) {
                rarray[i] = temp;
                i++;
            }
        }

        // 배열 출력
        System.out.println(Arrays.toString(rarray));
        Arrays.sort(rarray);
        System.out.println(Arrays.toString(rarray));
    }
}
