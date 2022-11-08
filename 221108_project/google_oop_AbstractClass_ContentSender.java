abstract class ContentSender{
	String title;
	String name;
	
	public ContentSender() {}
	
	public ContentSender(String title, String name) {
		this.title=title;
		this.name=name;
	}
	
	public abstract void sendMsg(String content) ;
}

class KakaoSender extends ContentSender{
	String content;
	
	public KakaoSender(String title, String name, String content) {
		super(title, name);
		this.content=content;
	}
	
	public void sendMsg(String recipient) {
		System.out.println("제목: "+this.title);
		System.out.println("이름: "+this.name);
		System.out.println("내용: "+this.content);
		System.out.println("받는 사람: "+recipient);
	}
}

class letterSender extends ContentSender{
	String content;
	
	public letterSender(String title, String name, String content) {
		super(title, name);
		this.content=content;
	}
	
	public void sendMsg(String recipient) {
		System.out.println("제목: "+this.title);
		System.out.println("이름: "+this.name);
		System.out.println("내용: "+this.content);
		System.out.println("받는 사람: "+recipient);
	}
}
public class google_oop_AbstractClass_ContentSender {

	public static void main(String[] args) {
		ContentSender cs1=new letterSender("sms문자", "수진", "3달러");
		cs1.sendMsg("민수");
		
		System.out.println();
		
		letterSender ls=new letterSender("sms문자", "홍길동", "5달러");
		ls.sendMsg("고길동");
		
		System.out.println();
		
		ContentSender cs2=new KakaoSender("카톡", "응애", "10달러");
		cs2.sendMsg("애기");
	}

}
