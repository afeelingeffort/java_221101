import java.util.Arrays;

/*
다음의 정수 배열이 있다
37, 92, 58, 46, 94, 29, 25, 58
위 배열에서 가장 큰 값과 가장 작은 값만을 분리하여 별도의 배열에 저장하라
*/
public class google_intArray_2 {

	public static void main(String[] args) {
		int[] arr= {37, 92, 58, 46, 94, 29, 25, 58};
		int max=arr[0];
		int min=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max)	max=arr[i];
			if(arr[i]<min)	min=arr[i];
		}
		
		int[] num= {max, min};
		
		System.out.println(Arrays.toString(num));
	}

}
