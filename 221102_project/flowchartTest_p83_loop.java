import java.util.Scanner;

public class flowchartTest_p83_loop {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		int sum=0; 
		int i;
		
		System.out.print("1부터 입력받은 수까지의 합을 출력합니다.>");
		i=scn.nextInt();
		
		for(i=1; i<=sum; i++){
			sum+=i;
		}

		System.out.print(sum);
		
	}

}
