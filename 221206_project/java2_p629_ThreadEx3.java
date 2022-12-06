//고의로 예외를 발생시켜 호출스택 내용 확인, main메서드 O
public class java2_p629_ThreadEx3 {

    public static void main(String[] args) {
        MyThreadEx3_1 t1 = new MyThreadEx3_1();
        t1.run();
    }

}

class MyThreadEx3_1 extends Thread {
    public void run() {
        throwException();
    }

    public void throwException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}