import java.util.Optional;
import java.util.stream.Stream;

public class google_Stream_allMatch_anyMatch_noneMatch_findFirst_findAny {

	public static void main(String[] args) {
		Stream<Integer> st1=Stream.of(1,2,3,4,5,6,7,8);
		boolean isAllMatch=st1.allMatch((i)->i<=9);
		System.out.println("isAllMatch="+isAllMatch);
		
		Stream<Integer> st2=Stream.of(1,2,3,4,5,6,7,8);
		boolean isAnyMatch=st2.anyMatch((i)->i<=1);
		System.out.println("isAnyMatch="+isAnyMatch);
		
		Stream<Integer> st3=Stream.of(1,2,3,4,5,6,7,8);
		boolean isNoneMatch=st3.noneMatch((i)->i>9);
		System.out.println(isNoneMatch);
		
		Stream<Integer> st4=Stream.of(1,2,3,4,5,6,7,8);
		Optional<Integer> any=st4.filter((i)->i>4).findAny();
		System.out.println("any="+any);
		
		Stream<Integer> st5=Stream.of(1,2,3,4,5,6,7,8);
		Optional<Integer> first=st5.filter((i)->i>4).findFirst();
		System.out.println("first="+frist);
	}

}
