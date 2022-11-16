import java.text.SimpleDateFormat;
import java.util.Date;

public class google_Calendar_SimpleDateFormat_1 {

    public static void main(String[] args) {
        Date nowDate = new Date();
        System.out.println("포맷 지정 전: " + nowDate);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
        String strNowDate = sdf.format(nowDate);
        System.out.println("포맷 지정 후: " + strNowDate);

    }

}
