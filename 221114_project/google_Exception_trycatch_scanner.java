
//코드 해석
import java.util.InputMismatchException;
import java.util.Scanner;

public class google_Exception_trycatch_scanner {

    public static void main(String[] args) {
        System.out.println("#1 try{} 직전");

        try {
            System.out.println("#2 try{} 시작");

            int[] numbers = new int[10];
            numbers[10] = 100;

            System.out.println("#3 try{} 종료");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("#4 catch{}");
            System.out.println("예외 메세지: " + ex.getMessage());
        } finally {
            System.out.println("#5 finally{}");
        }

        System.out.println("#6 try 종료 후");
        System.out.println();

        Scanner scn = new Scanner(System.in);
        try {
            System.out.println("정수를 입력하세요.");
            scn.nextInt();
            System.out.println("try 블록 종료");
        } catch (InputMismatchException ex) {
            System.out.println("예외 메세지: " + ex.getMessage());
            return;
        } finally {
            System.out.println("finally 수행");
            scn.close();
        }
    }

}
