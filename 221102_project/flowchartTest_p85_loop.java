
public class flowchartTest_p85_loop {

	public static void main(String[] args) {
		int sum=0; 
		for(int i=0; i<100; i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
		System.out.print(sum);
	}

}
