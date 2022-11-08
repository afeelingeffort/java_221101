abstract class Computerr {
	abstract void display();

	abstract void typing();

	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}

class DeskTop extends Computerr {
	void display() {
		System.out.println("DeskTop display");
	}

	void typing() {
		System.out.println("DeskTop typing");
	}

	public void turnOff() {
		System.out.println("Desktop turnoff");
	}

}

abstract class NoteBook extends Computerr {
	public void typing() {
		System.out.println("NoteBook typing");
	}
}

class MyNoteBook extends NoteBook {
	void display() {
		System.out.println("MyNoteBook display");
	}
}

public class google_oop_AbstractClass_Computer {

	public static void main(String[] args) {
		Computerr com=new DeskTop();
		com.display();
		com.turnOff();
		
		NoteBook myNote=new MyNoteBook();
		myNote.display();
	}

}
