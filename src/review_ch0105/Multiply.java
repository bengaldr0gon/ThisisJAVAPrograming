package review_ch0105;

public class Multiply {

	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {
			if (i == 6)
				++i;
			System.out.printf("[%d 단] \n", i);
			for (int j=1; j<=9; j++) {
				System.out.printf("%d X %d = %d \n", i, j, i*j);
				
				
			}
			System.out.println("--------------------------------------");
		}

	}

}
