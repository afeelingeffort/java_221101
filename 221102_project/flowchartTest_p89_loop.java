
public class flowchartTest_p89_loop {

	public static void main(String[] args) {
		int sum=0; 
		
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				sum-=i;
			}else {
				sum+=i;
			}
		}
		System.out.print(sum);
	}

}
