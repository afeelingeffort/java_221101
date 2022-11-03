import java.util.Scanner;

public class flowchartTest_p93_loop {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		int n=0; 
		
		System.out.print("약수를 구할 정수를 입력해주세요.>");
		n=scn.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
	}

}
