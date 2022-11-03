import java.util.Scanner;

public class Retouch_flowchartTest_p83_loop {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.print("1부터 입력받은 수(n)까지의 합을 출력합니다.>");
		int	n=scn.nextInt();
		
		int sum=0; 
		for(int i=1; i<=n; i++){
			sum+=i;
		}

		System.out.print(sum);
		
	}

}
