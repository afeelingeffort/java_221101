
//Run -> Run Configurations -> Arguments -> 2019 9입력 -> Run
import java.util.Calendar;

public class java_p373_Calendar_method_ex10_5 {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage : java Ex10_5 2019 9");
            return;
        }

        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int START_DAY_OF_WEEK = 0;
        int END_DAY = 0;

        Calendar sDay = Calendar.getInstance();
        Calendar eDay = Calendar.getInstance();

        sDay.set(year, month - 1, 1); // Calendar 에서는 month가 항상 0부터 시작하니까 -1을 해줌.
        eDay.set(year, month, 1);

        eDay.add(Calendar.DATE, -1);

        START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);

        END_DAY = eDay.get(Calendar.DATE);

        System.out.println("      " + args[0] + "년 " + args[1] + "월");
        System.out.println(" SU MO TU WE TH FR SA");

        for (int i = 1; i < START_DAY_OF_WEEK; i++) {
            System.out.println("\t");
        }

        for (int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
            System.out.print((i < 10) ? "  " + i : " " + i);
            if (n % 7 == 0)
                System.out.println();
        }
    }

}
