import java.util.Scanner;

interface Scheduler{
	void getNextCall();
	void sendCallToAgent();
}

class RoundRobin implements Scheduler{
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}
	
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다.");
	}
}

class LeastJob implements Scheduler{
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}
	
	public void sendCallToAgent() {
		System.out.println("현재 상담업무가 없거나 상담대기가 가장 적은 상담원에게 할당합니다.");
	}
}

class PriorityAllocation implements Scheduler{
	public void getNextCall() {
		System.out.println("고객의 등급이 높은 고객의 전화를 먼저 가져옵니다.");
	}
	
	public void sendCallToAgent() {
		System.out.println("업무 skill이 가장 높은 상담원의 대기열에 앞에 우선 배분합니다.");
	}
}


public class google_oop_interface_Scheduler {

	public static void main(String[] args) {
		System.out.println("R: 한명씩 제대로 할당");
		System.out.println("L: 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P: 우선순위가 높은 고객 먼저 할당");
		System.out.print("전화 상담 배분방식을 선택하세요.>");
		Scheduler scheduler=null;
		Scanner scn=new Scanner(System.in);
		char ch=scn.next().charAt(0);
		
//		int ch=System.in.read();
		
		if(ch=='R'||ch=='r') {
			scheduler=new RoundRobin();
		}else if(ch=='L'||ch=='l') {
			scheduler=new LeastJob();
		}else if(ch=='P'||ch=='p') {
			scheduler=new PriorityAllocation();
		}else {
			System.out.println("지원하지 않는 기능입니다.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
