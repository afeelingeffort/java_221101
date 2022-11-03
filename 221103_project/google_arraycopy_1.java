import java.util.Arrays;

/*
다음의 정수 배열이 있다.
37, 92, 58, 46, 94, 29, 25, 58
위 배열에서 짝수에 해당하는 값과 홀수에 해당하는 값을 별도로 짝수 값만 저장하는 짝수 배열,
홀수 값만 저장하는 홀수 배열로 분리하여 저장하도록 하라. 
*/

public class google_arraycopy_1 {

	public static void main(String[] args) {
		int[] arr = { 37, 92, 58, 46, 94, 29, 25, 58 };
		int[] odd = new int[0];
		int[] even = new int[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				int evenCopy[] = new int[even.length + 1];
				System.arraycopy(even, 0, evenCopy, 0, even.length);
				even = evenCopy;
				even[even.length - 1] = arr[i];
			} else {
				int oddCopy[] = new int[odd.length + 1];
				System.arraycopy(odd, 0, oddCopy, 0, odd.length);
				odd = oddCopy;
				odd[odd.length - 1] = arr[i];
			}
		}

		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(odd));
	}

}
