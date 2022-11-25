public

import java.util.Calendar;

public class java_Review_p370_Calendar_Class_ex10_2 {

    public static void main(String[] args) {
        final String[] DAY_OF_WEEK = { "", "일", "월", "화", "수", "목", "금", "토" };

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        date1.set(2020, 5, 30);
        System.out.println("date1은 " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일이고, ");
        System.out.println("오늘(date2)은 " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일입니다.");

        long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
        System.out.println("그 날(date1)부터 지금 (date2)까지 " + difference + "초가 지났습니다.");
        System.out.println("일(day)로 계산하면 " + difference / (24 * 60 * 60) + "일입니다.");

    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일 ";
    }
}