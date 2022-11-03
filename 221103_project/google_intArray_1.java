import java.util.Arrays;

/*
다음의 정수 배열이 있다.
37, 92, 58, 46, 94, 29, 25, 58
위 배열에서 짝수에 해당하는 값과 홀수에 해당하는 값을 별도의 짝수 값만 저장하는 짝수배열,
홀수 값만 저장하는 홀수 배열로 분리하여 저장하라. (정적 배열)
*/
public class google_intArray_1 {

	public static void main(String[] args) {
		int[] arr = new int[] { 37, 92, 58, 46, 94, 29, 25, 58 };
		int[][] arrEvenOdd = new int[2][8];
		int evenCount = 0, oddCount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				arrEvenOdd[0][evenCount++] = arr[i];
			} else {
				arrEvenOdd[1][oddCount++] = arr[i];
			}
		}

		for (int i = 0; i < arrEvenOdd.length; i++) {
			System.out.println(Arrays.toString(arrEvenOdd[i]));
		}
	}
}