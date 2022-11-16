import java.util.Calendar;

public class google_Calendar_method_2 {

    public static void main(String[] args) {
        Calendar time = Calendar.getInstance();

        System.out.println(time.getTime());

        time.set(Calendar.YEAR, 2020);
        System.out.println(time.getTime());

        time.set(1982, 1, 10); // 1은 2월을 나타냄.
        System.out.println(time.getTime());

        time.set(1982, 1, 10, 12, 34, 56);
        System.out.println(time.getTime());
    }

}
