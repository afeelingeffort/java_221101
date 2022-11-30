
public class java_p474_GenericsType_eliminate {

    public static void main(String[] args) {

    }

}

/*
 * 지네릭 타입의 경계를 제거한다.
 * class Box<T extends Fruit>{
 * void add(T t) {
 * //...
 * }
 * }
 */

class Box {
    void add(Fruit t) {
        // ...
    }

}

    /*
     * 지네릭 타입을 제거한 후에 타입이 일치하지 않으면, 형변환을 추가한다.
     * T get(int i) {
     * return list.get(i);
     * }
     */

Fruit get(int i) {
	return (Fruit)list.get(i);
}
