import java.util.ArrayList;

public class google_FrameWork_indexOf_lastIndexOf {

    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);

        System.out.println("indexOf(20): " + arrList.indexOf(20));
        System.out.println("indexOf(4): " + arrList.indexOf(4));
        System.out.println("lastIndexOf(4): " + arrList.lastIndexOf(4));
        System.out.println("indexOf(1): " + arrList.indexOf(1));
    }

}
