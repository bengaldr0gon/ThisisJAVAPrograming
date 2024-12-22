package review_ch0105;

public class Star2 {

	public static void main(String[] args) {
		        int rows = 13;  // 역삼각형의 높이

		        for (int i = rows; i >= 1; i--) {
		            // 공백 출력
		            for (int j = 1; j <= rows - i; j++) {
		                System.out.print(" ");
		            }
		            // 별 출력
		            for (int k = 1; k <= 2 * i - 1; k++) {
		                System.out.print("*");
		            }
		            // 줄바꿈
		            System.out.println();
		        }
		    }
		


	

}
