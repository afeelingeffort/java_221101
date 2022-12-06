//싱글쓰레드
public class java2_p630_ThreadEx4 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 300; i++) {
            System.out.print("-");
        }
        System.out.print("소요시간1: " + (System.currentTimeMillis() - startTime));

        for (int i = 0; i < 300; i++) {
            System.out.print("|");
        }
        System.out.print("소요시간2: " + (System.currentTimeMillis() - startTime));
    }

}
