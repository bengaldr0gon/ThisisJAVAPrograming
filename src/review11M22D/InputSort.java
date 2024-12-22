package review11M22D;

public class InputSort {
	
	public InputSort() {}
	
	public void sort(int[] array) { 
		for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    // 값 교환 (swap)
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
		}
		
	}
	
	

}
