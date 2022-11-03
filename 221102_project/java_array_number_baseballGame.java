import java.util.Random;
import java.util.Scanner;

public class java_array_number_baseballGame {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random r = new Random();

		int[] com = new int[3];
		int[] user = new int[3];
		int strike = 0;
		int ball = 0;

		com[0] = r.nextInt(9) + 1;
		com[1] = r.nextInt(9) + 1;

		while (com[0] == com[1]) {
			com[1] = r.nextInt(9) + 1;
		}
		
		
		com[2] = r.nextInt(9) + 1;

		while (com[0] == com[2] || com[1] == com[2]) {
			com[2] = r.nextInt(9) + 1;
		}

		
		for (int x : com) {
			System.out.println(x);
		}
		System.out.println();
		while (true) {
			strike = 0;
			ball = 0;

			for (int i = 0; i < 3; i++) {
				System.out.print((i + 1) + "번째 수를 입력하세요.>");
				user[i] = scn.nextInt();
			}
			if (user[0] == user[1] || user[1] == user[2] || user[0] == user[2]) {
				System.out.println("똑같은 입력이 있습니다.");
				continue;
			}
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (com[j] == user[i]) {
						if (i == j) {
							strike++;
						} else {
							ball++;
						}
					}
				}

			}
			if (strike == 3) {
				System.out.println("홈런입니다.");
				break;
			} else if (strike == 0 && ball == 0) {
				System.out.println("아웃입니다.");
			} else {
				System.out.println("Strike: " + strike + ", " + "Ball: " + ball + "입니다.");
			}

		}
	}

}
