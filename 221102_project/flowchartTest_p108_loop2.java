/*
1 2 3 4 5
1 2 3 4
1 2 3 
1 2 
1 
출력하기
*/

public class flowchartTest_p108_loop2 {

	public static void main(String[] args) {
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
