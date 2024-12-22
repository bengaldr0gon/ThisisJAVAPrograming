package review_ch0105;

public class Value {

	public static void main(String[] args) {
		int iValue1 = 5;
		int iValue2 = 8;
		
		System.out.println("1.iValue : " + iValue1);
		System.out.println("2.iValue : " + iValue2);
		
		int temp = iValue1;
		iValue1 = iValue2;
		iValue2 = temp;
		
		System.out.println("Change Value--------------");
		System.out.println("1.iValue : " + iValue1);
		System.out.println("2.iValue : " + iValue2);
		
		
	}

}
