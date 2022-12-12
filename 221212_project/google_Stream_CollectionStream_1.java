import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

interface Collection<E> extends Iterable<E>{
	default Stream<E> stream(){
		return StreamSupport.stream(spliterator(), false);
	}
}
public class google_Stream_CollectionStream_1 {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("a", "b", "c");
		Stream<String> stream=list.stream();
		Stream<String> parallelStream=list.parallelStream();	//병렬처리
	}

}
