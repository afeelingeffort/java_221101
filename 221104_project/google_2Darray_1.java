import java.util.Scanner;

public class google_2Darray_1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] students = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];

		int row = 0;
		int col = 0;

		System.out.println("===1분단===");
		for (int i = 0; i < students.length; i++) {
			if (i < students.length / 2) {
				arr1[row][col] = students[i];

				System.out.print(arr1[row][col] + " ");
				col++;

				if (col == arr1[row].length) {
					row++;
					col = 0;
					System.out.println();
				}
			} else {
				arr2[row][col] = students[i];
				System.out.print(arr2[row][col] + " ");
				col++;

				if (col == arr2[row].length) {
					row++;
					col = 0;
					System.out.println();
				}
			}

			if (i == students.length / 2-1) {
				row = 0;
				col = 0;
				System.out.println("===2분단===");
			}
		}

		System.out.println("===================================");
		System.out.print("학생 이름을 입력하세요.>");
		String name = scn.next();

		int part = 0;
		int line=0; 
		String direct="";
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				if(arr1[i][j].equals(name)) {
					part=1;
					line=i+1;
					direct=j==0?"왼쪽":"오른쪽";
				}
				else if(arr2[i][j].equals(name)) {
					part=2;
					line=i+1;
					direct=j==0?"왼쪽":"오른쪽";
				}
			}
		}
		
		if(part==0) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.print("검색하신 "+name+" 학생은 ");
			System.out.println(part+"분단 "+line+"번째 줄 "+direct+"에 있습니다.");
		}
		scn.close();
	}

}
