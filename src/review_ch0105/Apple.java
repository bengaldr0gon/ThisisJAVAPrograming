package review_ch0105;

public class Apple {

	public static void main(String[] args) {
		int apple = 573;
		int box = 100;
		int onebox = 12;
		int restbox = 0;
		
		if (apple % onebox == 0) {
			restbox = box - (apple / onebox);
		} else {
			restbox = box - (apple / onebox + 1);
		}
		
		
		System.out.printf("빈 박스는 %d 개 입니다.", restbox);

	}

}
