import java.util.Scanner;

public class google_array_address {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String[] name=new String[100];
		String[] tel=new String[100];
		String[] address=new String[100];
		int cnt=0;
		boolean run=true;
		
		while(run) {
			System.out.println("");
			System.out.println("=====================================");
			System.out.println("1. 주소를 등록하세요.");
			System.out.println("2. 주소 출력 ");
			System.out.println("3. 주소 검색 ");
			System.out.println("4. 프로그램 종료!");
			System.out.println("=====================================");
			System.out.print("메뉴를 선택하세요.");
			int menu=scn.nextInt();
			
			
			switch(menu) {
			case 1:
				System.out.print("학생명을 입력하세요.>");
				name[cnt]=scn.next();
				System.out.print("전화번호를 입력하세요.>");
				tel[cnt]=scn.next();
				System.out.print("주소를 입력하세요.>");
				address[cnt]=scn.next();
				cnt++;
				break;
				
			case 2:
				for(int i=0; i<cnt; i++) {
					System.out.println("이름 : "+name[i]);
					System.out.println("전화 : "+tel[i]);
					System.out.println("주소 : "+address[i]);
					System.out.println("");
				}
				break;
				
			case 3:
				System.out.print("이름 검색:");
				String sname=scn.next();
				for(int i=0; i<cnt; i++) {
					if(sname.equals(name[i])) {
						System.out.println("이름 : "+name[i]);
						System.out.println("전화 : "+tel[i]);
						System.out.println("주소 : "+address[i]);
						System.out.println("");
						
					}
				}
				break;
				
			case 4:
				run=false;
				System.out.println("!!프로그램 종료!!");
				break;
				
			default:
				System.out.println("1~4번을 선택하세요");
			}
		}
	}

}
