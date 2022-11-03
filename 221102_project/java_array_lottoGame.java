/*
로또게임
1~20까지 숫자 6개를 랜덤으로 생성하기
사용자가 입력한 값을 비교하여 6개 전부를 맞추면 1등
5개 맞췄으면 2등 4개 맞췄으면 3등 ... 그 외는 당첨되지 않았습니다라고 출력되게 하기.
*/
import java.util.Random;
import java.util.Scanner;

public class java_array_lottoGame {

	public static void main(String[] args) {
		// 기능을 사용하기위한 기본클래스 사용.
		Random r = new Random();
		Scanner scn = new Scanner(System.in);

		
		// 사용자로부터 입력받는 기능.
		System.out.print("생성된 로또 번호: ");
		int Array[] = new int[6];
		for (int i = 0; i < Array.length; i++) {
			Array[i] = r.nextInt(21);
			System.out.print(" " + Array[i]);
		}
		System.out.println("");
		
		
		
		// 사용자로부터 입력받는 기능2.
		System.out.println("사용할 숫자: 6개를 입력하세요.>");
		int iArray[] = new int[6];
		for (int i = 0; i < iArray.length; i++) {
			iArray[i] = scn.nextInt();
		}
		
		
		
		// 입력1, 2 체크
		int cnt = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (Array[i] == iArray[j]) {
					cnt++;
				}
			}
		}
		
		
		// 비교결과
		switch (cnt) {
		case 6:
			System.out.print("1등에 당첨되었습니다.");
			break;
		case 5:
			System.out.print("2등에 당첨되었습니다.");
			break;
		case 4:
			System.out.print("3등에 당첨되었습니다.");
			break;
		case 3:
			System.out.print("4등에 당첨되었습니다.");
			break;
		case 2:
			System.out.print("5등에 당첨되었습니다.");
			break;
		case 1:
			System.out.print("6등에 당첨되었습니다.");
			break;
		default:
			System.out.print("당첨되지 않았습니다.");
		}
	}
}
