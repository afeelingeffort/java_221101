abstract class AbsNotice{
	public abstract void notice();
	
	public void shutdownServer() {
		System.out.println("서버를 내립니다.");
	}
	
	public void printWorkNoti() {
		System.out.println("작업공지 화면을 띄워주세요.");
	}
}

class EmrgncyNotice extends AbsNotice{
	public void notice() {
		System.out.println("긴급 상황입니다!");
		
		shutdownServer();
		printWorkNoti();
	}
}

class RgNotice extends AbsNotice{
	public void notice() {
		System.out.println("정기점검입니다.");
		
		shutdownServer();
		printWorkNoti();
	}
}

class TempNoitce extends AbsNotice{
	public void notice() {
		System.out.println("임시점검입니다.");
		
		shutdownServer();
		printWorkNoti();
	}
}


public class google_oop_abstractClass_AbsNotice {

	public static void main(String[] args) {
		AbsNotice absnoti=new EmrgncyNotice();
		absnoti.notice();
	}

}
