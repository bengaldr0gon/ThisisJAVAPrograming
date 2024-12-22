package review_ch0105;

public class Star {

	public static void main(String[] args) {
		for(int i=0; i <= 10; i++) {
			
			for(int j=10; j >=0 ; j--) {
				if(j <= i)
					System.out.printf("*");
				else
					System.out.printf(" ");
				
			}
			System.out.println(" ");
		}
		for(int i=0; i< 10; i ++) {
			for(int j=0; j <=10 ; j++) {
				if(j > i)
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.println(" ");
		}

	}

}
