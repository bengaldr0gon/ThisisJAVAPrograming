package review_ch0105;

public class Caculate {

	public static void main(String[] args) {
		int iValue1 = 5;
		int iValue2 = 8;
		int iValue3 = 3;
		int iRsltVal = (iValue1++) + (++iValue2) % (--iValue3) /2+4;
		
		System.out.println(iRsltVal);
	}

}
