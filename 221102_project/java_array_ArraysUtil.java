import java.util.Arrays;

public class java_array_ArraysUtil {

	public static void main(String[] args) {
		int[] iArray=new int[3];
		
		for(int innerValue: iArray) {
			System.out.print(innerValue+",");
		}
		
		System.out.println();
		
		int[] iArray2= {231, 54, 321, 84};
		System.out.print("정렬하기 전: ");
		for(int innerValue: iArray2) {
			System.out.print(innerValue+",");
		}
		
		System.out.println();
		
		Arrays.sort(iArray2);
		System.out.print("정렬 후: ");
		for(int innerValue: iArray2) {
			System.out.print(innerValue+",");
		}
		
		System.out.println();
		
		
	}

}
