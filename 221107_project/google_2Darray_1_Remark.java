import java.util.Scanner;

public class google_2Darray_1_Remark {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] students = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };	//동적 배열로 students 초기화

		String[][] arr1 = new String[3][2];		//정적 배열로 1분단, 2분단 나누어 학생들을 3행 2열로 배치하게 할 배열. 
		String[][] arr2 = new String[3][2];

		int row = 0;	//열과 행을 0으로 초기화한다. 
		int col = 0;

		System.out.println("===1분단===");
		for (int i = 0; i < students.length; i++) {		//i가 0이고 i가 students길이보다 작으면 if문을 들어간다.
			if (i < students.length / 2) {				//(참) 만약 i가 students길이/2보다 작으면 students[i]를 arr[row][col]에 저장한다. 
				arr1[row][col] = students[i];

				System.out.print(arr1[row][col] + " ");
				col++;		//그리고 행을 ++한다. 

				if (col == arr1[row].length) {		//(참 참) 만약 col이 arr1[row]와 같으면 열을 ++하고, 행을 0으로 초기화한다. 
					row++;
					col = 0;
					System.out.println();
				}
			} else {	//(거짓) 첫번째 if문에서 거짓이 되면 이 문장을 실행한다. 
				arr2[row][col] = students[i];	//student[i]를 arr2[row][col]에 저장한다. 
				System.out.print(arr2[row][col] + " ");
				col++;	//행을 ++한다.

				if (col == arr2[row].length) {		//만약 col(행)이 arr2[row]와 같으면 열을 ++하고 col(행)을 0으로 초기화한다. 
					row++;
					col = 0;
					System.out.println();
				}
			}

			if (i == students.length / 2-1) {		//만약 i가 students길이와 같으면 /2-1을 한다. 1이 아니라 2-1을 하는 이유는 인덱스가 초과되기 때문에 2-1을 하여 중심을 잡아준다. 
				row = 0;	//열과 행을 0으로 초기화한다.
				col = 0;
				System.out.println("===2분단===");
			}
		}

		System.out.println("===================================");
		System.out.print("학생 이름을 입력하세요.>");
		String name = scn.next();

		int part = 0;	//분단
		int line=0; 	//n번째 줄
		String direct="";	//왼쪽 오른쪽
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				if(arr1[i][j].equals(name)) {	//1분단에 있는 명단이 아니면 else if문으로 간다. 
					part=1;		//'1분단'이라고 출력.
					line=i+1;	//인덱스가 0부터 시작하기 때문에 i+1을 해주어 n+1번째 학생을 출력하게 함.
					direct=j==0?"왼쪽":"오른쪽";	//삼항 연산자를 이용하여 j가 열을 나타내니 j가 0이면 왼쪽, 아니면 오른쪽으로 출력하게 함. 
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
