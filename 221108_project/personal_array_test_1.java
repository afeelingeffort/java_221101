
public class personal_array_test_1 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int a : arr) {
			System.out.println(a);
		}
		for (int b = 0; b < 5; b++) {
			System.out.println(b);
		}

		
		int k = 1;
		int[][] arr2 = new int[5][6];
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = k;
				k+=1;	//k++;
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j]+" ");
			}
		}
	}

}
