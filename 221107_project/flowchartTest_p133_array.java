import java.util.Arrays;

public class flowchartTest_p133_array {

	public static void main(String[] args) {
		int[] arr= {30, 24, 55, 23, 11, 5, 78, 54, 12, 77};
		int min=arr[0]; 
		for(int i=0; i<arr.length; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.print("최솟값: "+min);
	}

}
