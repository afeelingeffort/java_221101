import java.util.*;
import java.util.stream.Stream;

public class google_LambdaExpression_asList_iterator {

	public static void main(String[] args) {
		List<Integer> list=(List) Arrays.asList(10, 20, 30, 40, 50);
		Iterator<Integer> iterator=list.iterator();
		
		while(iterator.hasNext()) {
			Integer value=iterator.next();
			System.out.print(value+" ");
		}
		
		System.out.println();
		
		List<Integer> list2=(List)Arrays.asList(10,20,30,40,50);
		Stream<Integer> stream=list.stream();
		
		stream.forEach(value->System.out.print(value+" "));
	}

}
