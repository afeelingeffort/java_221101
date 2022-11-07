//다시
public class flowchartTest_p131_array {

	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int tmp=arr[0];
		for(int i=0; i<9; i++) {
			arr[i]=arr[i+1];
		}
		
		arr[9]=tmp;
		System.out.print(arr[0]);
	}

}
