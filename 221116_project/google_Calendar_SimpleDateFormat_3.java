import java.text.SimpleDateFormat;
import java.util.Date;

public class google_Calendar_SimpleDateFormat_3 {

    public static void main(String[] args) {
        Date nowDate = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        System.out.println(sdf.format(nowDate));

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf2.format(nowDate));

        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
        System.out.println(sdf3.format(nowDate));

        SimpleDateFormat sdf4 = new SimpleDateFormat("오늘은 E요일입니다.");
        System.out.println(sdf4.format(nowDate));
    }

}
