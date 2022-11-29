
import java.util.ArrayList;

class Product2{}
class Tv extends Product2{}
class Audio extends Product2{}

public class java_p463_Generics_ex12_1 {

	public static void main(String[] args) {
		ArrayList<Product2> productList=new ArrayList<Product2>();
		ArrayList<Tv> tvList=new ArrayList<Tv>();
		
		productList.add(new Tv());
		productList.add(new Audio());
		
		tvList.add(new Tv());
		tvList.add(new Tv());
		
		printAll(productList);
	}
	
	public static void printAll(ArrayList<Product2> list) {
		for(Product2 p: list)
			System.out.println(p);
	}

}
