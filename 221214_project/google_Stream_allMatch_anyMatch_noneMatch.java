import java.util.Arrays;

public class google_Stream_allMatch_anyMatch_noneMatch {

	public static void main(String[] args) {
		int[] arr= {2,4,6,8,10};
		
		boolean result=Arrays.stream(arr).allMatch(num->num%2==0);
		System.out.println(result);
		
		boolean result2=Arrays.stream(arr).anyMatch(num->num%3==0);
		System.out.println(result2);
		
		result=Arrays.stream(arr).noneMatch(num->num%7==0);
		System.out.println(result);
	}

}
