import java.util.Scanner;

public class google_array_score_average_2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		boolean run=true;
		int num=0; 
		int score[]= {};
		
		while(run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("------------------------------------------------------");
			System.out.println("선택.>");
			int menu=scn.nextInt();
			switch(menu) {
			case 1:
				System.out.print("학생수>");
				num=scn.nextInt();
				score=new int[num];
				
				break;
				
			case 2:
				for(int i=0; i<score.length; i++) {
					System.out.print("학생"+(i+1)+">");
					score[i]=scn.nextInt();
				}
				
				break;
				
			case 3:
				for(int i=0; i<score.length; i++) {
					System.out.println("학생"+(i+1)+":"+score[i]);
				}
				
				break;
				
			case 4: 
				int max=0; 
				int sum=0; 
				double avg=0;
				for(int i=0; i<score.length; i++) {
					max=(max<score[i])?score[i]:max;
					sum+=score[i];
				}
				
				avg=(double)sum/num;
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+avg);
				break;
			
			default:
				run=false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
