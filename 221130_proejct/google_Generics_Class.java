class ExClassGeneric<T>{
	private T t;
	
	public void setT(T t) {
		this.t=t;
	}
	
	public T getT() {
		return t;
	}
}

/*위와 같이 클래스를 설계할 때 구체적인 타입을 명시하지 않고 타입 파라미터로 넣어두었다가
실제 설계한 클래스가 사용되어질 때 구체적으로 타입을 지정하면서 사용하면 타입 변환을 최소화 시킬 수 있다. 
*/
public class google_Generics_Class {

	public static void main(String[] args) {
		//ExClassGeneric<String> exGeneric=new ExClassGeneric<>(); 
	}

}
