package ch08.sec10.exam01;

public class B implements A{
	
	@Override
	public void PrintState(String sVal) {
		System.out.println("B:Print out..." + sVal);
	}

}
