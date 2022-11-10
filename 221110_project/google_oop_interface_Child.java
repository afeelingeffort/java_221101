import java.util.*;

interface Printable{
	int x=10;
	void print();	//추상메서드
}

interface Drawable{
	void draw();
	default void msg() {	//인터페이스 default 메서드에 대해 공부하기.
		System.out.println("Drawable default method");
	}
}

interface Showable extends Printable{
	void show();
}

class Parent{
	public void method2() {
		System.out.println("This is method2() in Parent Class");
	}
}

class Child extends Parent implements Printable, Drawable{
	public void print() {
		System.out.println("Hello");
	}
	
	public void draw() {
		System.out.println("drawing rectangle");
	}
	
}

class CustomDialog{		// 이 클래스 해석	
	interface CustomDialogListener{
		void onAgreeButtonClicked(String smsotp);
	}
	
	private CustomDialogListener customDialogListener;
	public void setCustomDialogListener(CustomDialogListener listener) {
		customDialogListener=listener;
	}
	
	String smsotp;
	
	public void Click() {
		smsotp="123455";
		customDialogListener.onAgreeButtonClicked(smsotp);
	}
}

class Interface_EX implements Showable{
	public void print() {
		System.out.println("print interface method implemented");
	}
	
	public void show() {
		System.out.println("show interface method implemented");
	}
}
public class google_oop_interface_Child {

	public static void main(String[] args) {
		Child c=new Child();
		c.print();
		c.draw();
		c.msg();
		c.method2();
		
		System.out.println(Printable.x);
		
		Interface_EX ie=new Interface_EX();
		ie.print();
		ie.show();
		
		CustomDialog dialog=new CustomDialog();
		dialog.setCustomDialogListener(new CustomDialog.CustomDialogListener() {	//익명구현객체 
			@Override
			public void onAgreeButtonClicked(String smsotp) {
				System.out.println("customdialog result: "+smsotp);
			}
		});
		dialog.Click();
	}

}
