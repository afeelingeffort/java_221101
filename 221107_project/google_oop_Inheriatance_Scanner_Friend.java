import java.util.Scanner;

class Friend {
	String name;
	String phoneNum;
	String addr;

	Friend() {
	}

	public Friend(String name, String phone, String addr) {
		this.name = name;
		this.phoneNum = phone;
		this.addr = addr;
	}

	public void showData() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phoneNum);
		System.out.println("주소: " + addr);
	}

	public void showBasicInfo() {

	}
}

class HighFriend extends Friend {
	String work;

	public HighFriend(String name, String phone, String addr, String work) {
		super(name, phone, addr);
		this.work = work;
	}

	public void showData() {
		super.showData();
		System.out.println("직업: " + work);
	}

	public void showBasicInfo() {
		System.out.println("이름: " + name);
		System.out.println("직업: " + work);
	}
}

class UnivFriend extends Friend {
	String major;

	public UnivFriend(String name, String phone, String addr, String major) {
		super(name, phone, addr);
		this.major = major;
	}

	public void showData() {
		super.showData();
		System.out.println("전공: " + major);
	}

	public void showBasicInfo() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phoneNum);
		System.out.println("전공: " + major);
	}
}

class FriendInfoHandler {
	private Friend[] myFriends;

	private int numOfFriends;

	public FriendInfoHandler(int num) {
		myFriends = new Friend[num];
		numOfFriends = 0;
	}

	private void addFriendInfo(Friend fri) {
		myFriends[numOfFriends++] = fri;
	}

	public void addFriend(int choice) {
		String name, phoneNum, addr, job, major;

		Scanner scn = new Scanner(System.in);

		System.out.println("이름: ");
		name = scn.nextLine();
		System.out.println("전화번호: ");
		phoneNum = scn.nextLine();
		System.out.println("주소: ");
		addr = scn.nextLine();

		if (choice == 1) {
			System.out.print("직업: ");
			job = scn.nextLine();
			addFriendInfo(new HighFriend(name, phoneNum, addr, job));
		} else if (choice == 2) {
			System.out.print("학과: ");
			major = scn.nextLine();
			addFriendInfo(new UnivFriend(name, phoneNum, addr, major));
		} else {
			System.out.println("값을 잘못 입력하셨습니다.");
			return;
		}

		System.out.println("입력완료\n");
	}

	public void showAllData() {
		for (int i = 0; i < numOfFriends; i++) {
			myFriends[i].showData();
			System.out.println("\n");
		}
	}

	public void showAllsimpleData() {
		for (int i = 0; i < numOfFriends; i++) {
			myFriends[i].showBasicInfo();
			System.out.println("\n");
		}
	}
}

public class google_oop_Inheritance_Scanner_Friend {

	public static void main(String[] args) {
		FriendInfoHandler handler = new FriendInfoHandler(100);

		while (true) {
			System.out.println("***********메뉴 선택***********");
			System.out.println("1. 고교 친구 저장");
			System.out.println("2. 대학 친구 저장");
			System.out.println("3. 친구 전체 정보 출력");
			System.out.println("4. 친구 기본 정보 출력");
			System.out.println("5. 프로그램 종료");

			System.out.println("번호 입력>");
			Scanner scn = new Scanner(System.in);
			int choice = scn.nextInt();

			switch (choice) {
			case 1:
			case 2:
				handler.addFriend(choice);
				break;
			case 3:
				handler.showAllData();
				break;
			case 4:
				handler.showAllsimpleData();
			case 5:
				System.out.println("프로그램이 종료됩니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}

}
