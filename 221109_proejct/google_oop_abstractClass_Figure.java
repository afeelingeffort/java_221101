abstract class Figure{
	abstract double getArea();
	abstract double getRound();
}

class Rect extends Figure{
	int width;
	int height;
	
	public Rect(int width, int height) {
		this.width=width;
		this.height=height;
	}
	
	public double getArea() {
		return width*height;
	}
	
	public double getRound() {
		return(width+height)*2;
	}
}

class Circle extends Figure{
	int r;
	
	public Circle(int r) {
		this.r=r;
	}
	
	public double getArea() {
		return Math.PI*Math.pow(r, 2);
	}
	
	public double getRound() {
		return(2*r*Math.PI);
	}
}
public class google_oop_abstractClass_Figure {

	public static void main(String[] args) {
		Rect r1=new Rect(4, 5);
		System.out.println("가로가 "+r1.width+", 세로가 "+r1.height+"인 사각형의 넓이는 "+r1.getArea()+"이고 둘레는 "+r1.getRound()+" 입니다.");
		
		Circle c1=new Circle(4);
		System.out.printf("반지름이 "+c1.r+"인 원의 넓이는"+c1.getArea()+"이고 둘레는 "+c1.getRound()+" 입니다.");
	}

}
