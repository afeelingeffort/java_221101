import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.*;

public class google_javautilfunctionPackage {

	public static void main(String[] args) {
		Supplier<Integer> s=()->(int)(Math.random()*100)+1;
		Consumer<Integer> c=(i)->System.out.println("짝수: "+i);
		Predicate<Integer> p=(i)->i%2==0;
		List<Integer> list1=new ArrayList();
		
		makeList(s, list1);
		filter(p, c, list1);
	}
	
	static<T> void makeList(Supplier<T> s, List<T> list) {
		for(int i=0; i<5; i++) {
			list.add(s.get());
		}
	}
	
	static<T> void filter(Predicate<T> p, Consumer<T> c, List<T> list1) {
		for(T i:list1) {
			if(p.test(i)) {
				c.accept(i);
			}
		}
	}
}


