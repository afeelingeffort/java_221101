import java.text.SimpleDateFormat;
import java.util.Calendar;

//밀리초로 2000년 1월 18일 00시 00분부터 흐른 시간 구하기.
public class google_Calendar_SimpleDateFormat_4 {

    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        System.out.println("2000년 00시 00분부터 흐른 초: " + today.getTimeInMillis() / 1000);

        SimpleDateFormat sdf = new SimpleDateFormat("a hh:mm:ss");
        System.out.println("현재시간 " + sdf.format(today.getTimeInMillis()));

        Calendar newYear = Calendar.getInstance();
        newYear.set(Calendar.YEAR, 2000);
        newYear.set(Calendar.MONTH, Calendar.JANUARY);
        newYear.set(Calendar.DAY_OF_MONTH, 18);

        long diff = newYear.getTimeInMillis() - today.getTimeInMillis();
        Calendar dDay = Calendar.getInstance();
        dDay.setTimeInMillis(diff);
        System.out.println("남은 날 수 : " + (dDay.get(Calendar.DAY_OF_YEAR) - 1));

        diff = diff / (60 * 60 * 24 * 1000);
        System.out.println("남은 날 수 : " + diff);
    }

}
