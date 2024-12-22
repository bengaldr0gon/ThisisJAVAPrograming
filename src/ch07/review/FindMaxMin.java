package ch07.review;

public class FindMaxMin {

	public static void main(String[] args) {
		MaxMin find = new MaxMin();
		int r = 0;
		int temp = 0;
		
		while(r<10) {
			temp = (int)(Math.random() * 100) + 1;
			find.num[r] = temp;
			r++;
			
		}
		
		find.whbig(find.num);
		find.whsmall(find.num);
		

	}

}
