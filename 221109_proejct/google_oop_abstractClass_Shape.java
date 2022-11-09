abstract class Shape{
	double result=0;
	public abstract double calc();
	public abstract void draw();
	
	public void show() {
		System.out.println("Super class Shape");
	}
}

class Circle2 extends Shape{
	double r=5.0;
	public double calc() {
		result=r*r*Math.PI;
		return result;
	}
	
	public void draw() {
		System.out.println("원의 넓이: "+result+"인 원을 그렸습니다.");
	}
}

class Triangle extends Shape{
	int w=10, h=20;
	
	public double calc() {
		result=(w*h)/2;
		return 0;
	}
	
	public void draw() {
		System.out.println("삼각형의 넓이: "+result+"인 삼각형을 그렸습니다.");
	}
}

class Square extends Shape{
	int w=10, h=20;
	
	public double calc() {
		result=(w*h);
		return result;
	}
	
	public void draw() {
		System.out.println("사각형의 넓이: "+result+"인 사각형을 그렸습니다.");
	}
}
public class google_oop_abstractClass_Shape {

	public static void main(String[] args) {
		Circle2 c=new Circle2();
		c.calc();
		c.draw();
		Triangle t=new Triangle();
		t.calc();
		t.draw();
		Square s=new Square();
		s.calc();
		s.draw();
		
	}

}
