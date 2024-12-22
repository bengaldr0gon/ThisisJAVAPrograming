package review11M22D;

public class Notmulti3 {

	public static void main(String[] args) {
		int [] NoMThree = new int [100];
		int icnt = 0;
		
		for (int i = 1; i <= 100; i++) {
            NoMThree[i - 1] = i;
        }
		
		for(int i=1; i<=100; i++) {
			if (i % 3 != 0) {
				System.out.println(NoMThree[i-1]);
				++icnt;
			}
			else {
				continue;
			}
		}
		System.out.println("3의 배수가 아닌 수의 개수는: " + icnt);

	}

}
