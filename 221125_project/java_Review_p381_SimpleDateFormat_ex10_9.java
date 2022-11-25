import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class java_Review_p381_SimpleDateFormat_ex10_9 {

    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

        try {
            Date d = df.parse("2019년 11월 25일");
            System.out.println(df2.format(d));
        } catch (Exception e) {
        }
    }

}
