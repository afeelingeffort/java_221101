import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class java_p383_Calendar_Class_Excercise_10_1 {

    public static void main(String[] args) {
        Calendar sCal = Calendar.getInstance();
        Calendar eCal = Calendar.getInstance();
        boolean newMon = false;

        sCal.set(2020, 0, 1);
        eCal.set(2020, 1, 1);
        eCal.add(Calendar.DATE, -1);

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일입니다.");

        int count = 0;
        int IS_SUNDAY = 0;
        IS_SUNDAY = sCal.get(Calendar.DAY_OF_WEEK);
        int END_DATE = eCal.get(Calendar.DATE);
        int i = 0;
        for (i = 1; i <= END_DATE; i++) {
            newMon = false;
            IS_SUNDAY = sCal.get(Calendar.DAY_OF_WEEK);

            if (IS_SUNDAY == 1) {
                count++;
            }

            if (count == 2) {
                Date date = new Date(sCal.getTimeInMillis());
                System.out.println(df.format(date));
                if (sCal.get(Calendar.MONTH) == 11) {
                    break;
                } else {
                    count = 0;
                    sCal.add(Calendar.MONTH, 1);
                    sCal.set(Calendar.DATE, 1);
                    eCal.add(Calendar.MONTH, 1);
                    eCal.set(Calendar.DATE, 1);
                    eCal.add(Calendar.DATE, -1);
                    newMon = true;
                    END_DATE = eCal.get(Calendar.DATE);
                    i = 1;
                }

            }

            if (newMon != true) {
                sCal.add(Calendar.DATE, 1);
            }

        }

    }

}