import java.util.Scanner;

//5개의 성적 입력하고 평균 구하기
public class google_array_score_average {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score[] = new int[5];
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("성적을 입력하세요.>");
			score[i] = scn.nextInt();
			sum += score[i];
		}

		System.out.print("평균.> " + sum / 5);
	}

}
