package ch11.sec04;

public class TryWithResourceExample {

	public static void main(String[] args) throws Exception{
		MyResource res1 = null;
		try {
		res1 = new MyResource("res1");
		
		System.out.println(Integer.parseInt(res1.read1()));
		System.out.println(Integer.parseInt(res1.read2()));

	
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			res1.close();
		}
		
		try (MyResource res2 = new MyResource("res2")){
			res1 = new MyResource("res1");
			
			System.out.println(Integer.parseInt(res1.read1()));
			System.out.println(Integer.parseInt(res1.read2()));
		
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		MyResource res3 = new MyResource("res3");
		try (res3){
			System.out.println(Integer.parseInt(res1.read1()));
			System.out.println(Integer.parseInt(res1.read2()));
			

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
