import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class google_Calendar_Date_conversion_2 {

	public static void main(String[] args) {
		Calendar cal=new GregorianCalendar(2022, 1, 18);
		
		Date date=cal.getTime();	//getTime()메서드는 Calendar가 나타내는 날짜와 같은 날짜를 나타내는 Date객체를 리턴한다. 
		
		System.out.println(date);	
	}

}
