// X
import java.util.Scanner;

public class java_array_rock_scissors_paper {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String[] rsp = { "Rock", "Scissors", "Paper" };
		// win:1, lose:-1, draw:0
		int[][] rsp_wld = { {0,1,-1},{-1,0,1},{1,-1,0}};

		for (int i = 0; i < 1; i++) {
			System.out.print("Rock Scissors papaer : ");
			String me = scn.nextLine();

			int com = (int) (Math.random() * 3);
			System.out.println(rsp[com]);

			while (me.equals("Rock")) {
				if (com == 0) {
					System.out.println("Draw");
					break;
				}
				if (com == 1) {
					System.out.println("You win");
					break;
				}
				if (com == 2) {
					System.out.println("You lose");
					break;
				}
			}
			while (me.equals("Scissors")) {
				if (com == 0) {
					System.out.println("You lose");
					break;
				}
				if (com == 1) {
					System.out.println("Draw");
					break;
				}
				if (com == 2) {
					System.out.println("You win");
					break;
				}
			}
			while (me.equals("Paper")) {
				if (com == 0) {
					System.out.println("You win");
					break;
				}
				if (com == 1) {
					System.out.println("You lose");
					break;
				}
				if (com == 2) {
					System.out.println("Draw");
					break;
				}
			}
		}
	}

}
