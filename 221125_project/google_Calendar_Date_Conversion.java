//자바에서는 Date보다는 Calendar쓰기를 권장하고 있어서 사용함. 

import java.util.Calendar;
import java.util.Date;

public class google_Calendar_Date_Conversion {

    public static void main(String[] args) {
        Date date = new Date();

        Calendar cal = Calendar.getInstance();

        cal.setTime(date);

        System.out.println(date);
        System.out.println(cal.getTime());

    }

}
