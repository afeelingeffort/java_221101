import java.util.Scanner;

public class flowchartTest_p97_loop {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		int a=0, b=0;
		
		System.out.print("정수를 입력해주세요.>");
		a=scn.nextInt();
		System.out.print("정수를 입력해주세요.>");
		b=scn.nextInt();
		
		for(int i=a; i>=1; i--) {
			if(a%i==0 && b%i==0) {
				System.out.print(i);
				break;
			}
		}
	}

}



