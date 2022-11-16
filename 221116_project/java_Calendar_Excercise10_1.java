import java.text.SimpleDateFormat;
import java.util.Calendar;

public class java_Calendar_Excercise10_1 {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        cal.set(Calendar.YEAR, 2020);
        for (int i = Calendar.JANUARY; i <= Calendar.DECEMBER; i++) {
            cal.set(Calendar.MONTH, i);
            cal.set(Calendar.WEEK_OF_MONTH, 3);
            cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
            System.out.println(sdf.format(cal.getTime()) + "은 2번째 일요일입니다.");
        }
    }

}
