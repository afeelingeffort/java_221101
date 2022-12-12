import java.util.Arrays;
import java.util.stream.Stream;

public class google_Stream_ArraysStream_1 {

	public static void main(String[] args) {
		String[] arr=new String[] {"a", "b", "c"};
		Stream<String> stream=Arrays.stream(arr);
		Stream<String> streamOfArrayPart=Arrays.stream(arr, 1, 3);
		
	}

}
