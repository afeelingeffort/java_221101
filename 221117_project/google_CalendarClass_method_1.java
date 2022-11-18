import java.util.Calendar;
import java.util.GregorianCalendar;

public class google_CalendarClass_method_1 {

	public static void main(String[] args) {
		Calendar rightNow=Calendar.getInstance();
		
		int y=rightNow.get(Calendar.YEAR);
		System.out.println(y);
		
		int m=rightNow.get(Calendar.MONTH)+1;
		System.out.println(m);
		
		int d=rightNow.get(Calendar.DATE);
		System.out.println(d);
		
		int w=rightNow.get(Calendar.DAY_OF_WEEK);
		System.out.println(w);
		
		System.out.println(y+"-"+m+"-"+d+" "+w);
		
		System.out.println(Calendar.SUNDAY);
		System.out.println(Calendar.MONDAY);
		System.out.println(Calendar.TUESDAY);
		System.out.println(Calendar.WEDNESDAY);
		System.out.println(Calendar.THURSDAY);
		System.out.println(Calendar.FRIDAY);
		System.out.println(Calendar.SATURDAY);
		
		System.out.println();
		
		String week="";
		switch(w)
		{
			case Calendar.SUNDAY: week="일요일"; break;
			case Calendar.MONDAY: week="월요일"; break;
			case Calendar.TUESDAY: week="화요일"; break;
			case Calendar.WEDNESDAY: week="수요일"; break;
			case Calendar.THURSDAY: week="목요일"; break;
			case Calendar.FRIDAY: week="금요일"; break;
			case Calendar.SATURDAY: week="토요일"; break;
		}
		
		System.out.println(y+"-"+m+"-"+d+" "+week);
		
		System.out.println();
		
		Calendar rightNow2=new GregorianCalendar();	
		String[] week2= {"일요일", "월요일", "화요일", "수요일","목요일","금요일","토요일"};
		
		rightNow2.set(2022, 01, 18);
		
		System.out.println(rightNow2.get(Calendar.DAY_OF_WEEK));
		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
		
		rightNow2.set(2000, 01, 18);
		
		System.out.println(rightNow2.get(Calendar.DAY_OF_WEEK));
		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
	}

}
