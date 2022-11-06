//원하는 개수만큼 1~100 사이의 수 생성하고 그 합과 평균 구하기.

import java.util.Random;
import java.util.Scanner;

public class google_array_mathRandom {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random r = new Random();

		System.out.print("임의의 수를 n개 출력합니다.>");
		int n = scn.nextInt();
		int sum = 0;
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = r.nextInt(100) + 1;
		}
		for (int i : arr) {
			System.out.print(i + " ");
			sum += i;
		}

		double average = sum / n;
		System.out.println("\n합: " + sum + " 평균: " + average);
	}

}
