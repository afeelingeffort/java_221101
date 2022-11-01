import java.util.Scanner;

public class personal_week_garbageDisposal {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		String[] week= {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		String[] garbage_disposal= {"일반쓰레기", "음식물 쓰레기", "종의류", "의류", "비닐류", "병류"};
		
		System.out.print("요일을 입력해주세요.>");
		week[0]=scn.next();
			
			switch(week[0]){
			case "월요일": case "목요일": 
				System.out.printf("%s : %s, %s", week[0], garbage_disposal[0], garbage_disposal[1]);
				System.out.printf("%s : %s, %s", week[3], garbage_disposal[0], garbage_disposal[1]);
				break;
			case "수요일": 
				System.out.printf("%s : %s, %s, %s, %s", week[2], garbage_disposal[2], garbage_disposal[3], garbage_disposal[4], garbage_disposal[5]);
				break;
			case "토요일": 
				System.out.printf("%s: %s, %s", week[5], garbage_disposal[6], garbage_disposal[7]);
				break;
			case "일요일":
				System.out.printf("%s : %s, %s, %s, %s", week[6], garbage_disposal[2], garbage_disposal[3], garbage_disposal[4], garbage_disposal[5]);
				break;
			default:
				System.out.print("쓰레기가 배출되지 않는 날입니다.");
				break;
		}
	}

}
