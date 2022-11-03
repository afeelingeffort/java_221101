// 정수 여러 개를 입력받고 싶을 때 scanner는 어떻게 써야 하지? 
import java.util.Scanner;

public class flowchartTest_p106_loop {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		int a=0; 
		
		System.out.print("정수를 입력해주세요.> ");
		a=scn.nextInt();
		
		int min=a;
		while(a!=0) {
			if(a<min) {
				min=a;
			}
			a=scn.nextInt();
		}
	}

}
