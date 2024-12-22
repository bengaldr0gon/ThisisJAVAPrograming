package ch07.review;

public class MaxMin {
	
	public int [] num = new int[10];
	public int maxnum;
	public int minnum;
	
	public MaxMin() {
		System.out.println("중복되지않는 정수 10개를 생성합니다.");
	}
	
	public void whbig(int [] num) {
		for(int i = 0; i < num.length; i++) {
			for(int j = 1; j < num.length - 1 ; j++) {
				if (num[i] >= num[j]) {
					
				} else {
					break;
				}
				num[i] = maxnum;
					
			}
		}
		System.out.println("최댓값은 :" + maxnum);
	}
		
	public void whsmall(int [] num) {
		for(int i = 0; i < num.length; i++) {
			for(int j = 1; j < num.length - 1 ; j++) {
				if (num[i] <= num[j]) {
					
				} else {
					break;
				}
				num[i] = minnum;
					
			}
		}
		System.out.println("최솟값은 :" + minnum);
			
		
		
		
	}

}
