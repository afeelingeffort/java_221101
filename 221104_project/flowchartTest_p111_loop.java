
public class flowchartTest_p111_loop {

	public static void main(String[] args) {
		int chk;
		for(int i=2; i<=100; i++) {
			chk=1; 
			for(int j=2; j<i-1; j++) {
				if(i%j==0) {
					chk=0; 
					break;
				}
			}
			if(chk==1) {
				System.out.print(i+" ");
			}
		}
	}

}
