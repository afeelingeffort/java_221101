import java.text.SimpleDateFormat;
import java.util.Date;

public class google_Calendar_SimpleDateFormat_2 {

    public static void main(String[] args) {
        try {
            String strDate = "20221116";
            SimpleDateFormat dtFormat = new SimpleDateFormat("yyyyMMdd");
            SimpleDateFormat newDtFormat = new SimpleDateFormat("yyyy-MM-dd");

            Date formatDate = dtFormat.parse(strDate);

            String strNewDtFormat = newDtFormat.format(formatDate);
            System.out.println("포맷 전: " + strDate);
            System.out.println("포맷 후: " + strNewDtFormat);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
