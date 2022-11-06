class Calculator{		//extends Object 가 생략되어 있고 Object에는 toString()이라는 메서드가 있음. 
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left=left;
		this.right=right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
	
	public String toString() {	//String toString() 메서드 기억하고, 예제 더 보기.
		return "left:"+this.left+", right:"+this.right;
	}
	
}
public class google_oop_toString_2 {

	public static void main(String[] args) {
		Calculator c1=new Calculator();
		
		c1.setOprands(10, 20);
		System.out.println(c1);	//c1.toString()도 같은 결과가 나옴.
	}

}
