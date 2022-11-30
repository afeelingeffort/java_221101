public

import java.util.Iterator;

public class java_p474_GenericsType_eliminate_2 {

    public static void main(String[] args) {
    /*
     * 와일드 카드가 포함되어 있는 경우에는 적절한 타입으로 형변환이 추가 됨.
     * static Juice makeJuice(FruitBox<? extends Fruit> box) {
     * String tmp="";
     * for(Fruit f : box.getList()) tmp+=f+" ";
     * return new Juice(tmp);
     * }
     */

    static Juice makeJuice(FruitBox box) {
        String tmp = "";
        Iterator it = box.getList().iterator();
        while (it.hasNext()) {
            tmp += (Fruit) it.next() + " ";
        }
        return new Juice(tmp);
    }
}

}