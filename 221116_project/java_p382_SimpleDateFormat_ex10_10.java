import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class java_p382_SimpleDateFormat_ex10_10 {

    public static void main(String[] args) {
        String pattern = "yyyy/MM/dd";
        DateFormat df = new SimpleDateFormat(pattern);
        Scanner scn = new Scanner(System.in);

        Date inDate = null;

        System.out.println("날짜를 " + pattern + "의 형태로 다시 입력해주세요.(입력예: 2020/12/31)");

        while (scn.hasNextLine()) {
            try {
                inDate = df.parse(scn.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("날짜를 " + pattern + "의 형태로 다시 입력해주세요.(입력예: 2020/12/31)");
            }
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(inDate);
        Calendar today = Calendar.getInstance();
        long day = (cal.getTimeInMillis() - today.getTimeInMillis()) / (60 * 60 * 1000);
        System.out.println("입력하신 날짜는 현재와 " + day + "시간 차이가 있습니다.");
    }

}
