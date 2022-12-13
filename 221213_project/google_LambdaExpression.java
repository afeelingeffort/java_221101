
public class google_LambdaExpression {

    public static void main(String[] args) {

        // 1. 화살표를 함수 몸체로 이용하여 사용함.
        // 2. 함수 몸체가 단일실행문이면 {}를 생략가능.
        // 3. return문으로 구성된 경우 {}생략 불가.

        /*
         * 정상적인 유형
         * ()->{}
         * ()->1
         * ()->{return 1;}
         * (int x)->x+1
         * (x)->x+1
         * x->x+1
         * (int x)->{return x+1;}
         * x->{return x+1;}
         * (int x, int y)->x+y
         * (x, y)->x+y
         * (x, y)->{return x+y;}
         * (String lam)->lam.length()
         * lam->lam.length()
         * (Thread lamT)->{lamT.start();}
         * lamT->{lamT.start();}
         */

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        }).start();

        // 위 문장을 람다식으로 아래와 같이 간단히 줄일 수 있음.
        new Thread(() -> {
            System.out.println("Hello World");
        }).start();
    }

}
