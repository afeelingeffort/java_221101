interface MyFunction2 {
    int calc(int x);
}

public class google_LamdaExpression_fsquare {
    public google_LamdaExpression_fsquare() {
        MyFunction2 fsquare = (x) -> {
            return x * x;
        };
        System.out.println("fsqure의 결과:" + fsquare.calc(5));
    }

    public static void main(String[] args) {
        new google_LamdaExpression_fsquare();
    }

}
