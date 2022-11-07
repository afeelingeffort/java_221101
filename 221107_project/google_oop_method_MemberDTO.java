class MemberDTO{
	private int number;
	private String name;
	private boolean isActivated;
	
	public void setNumber(int number) {
		this.number=number;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setActivated(boolean isActivated) {
		this.isActivated=isActivated;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isActivated() {	//boolean의 접근자는 get으로 시작하지 않고 is로 시작하는 것이 일반적인 관례이다.
		return isActivated;
	}
}
public class google_oop_method_MemberDTO {

	public static void main(String[] args) {
		MemberDTO member=new MemberDTO();
		
		member.setNumber(1);
		member.setName("홍길동");
		member.setActivated(true);
		
		System.out.println("회원번호: "+member.getNumber());
		System.out.println("회원명: "+member.getName());
		System.out.println("회원활성화상태: "+member.isActivated());
	}

}
