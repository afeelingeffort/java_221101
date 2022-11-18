import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class google_CalendarClass_method_2 {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int y, m;
		int w;
		int i;
		
		do {
			System.out.println("연도 입력: ");
			y=Integer.parseInt(br.readLine());
		}
		while(y<1);
		
		do {
			System.out.println("월 입력: ");
			m=Integer.parseInt(br.readLine());
		}
		while(m<1||m>12);
		
		cal.set(y, m-1, 1);
		
		w=cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println();
		System.out.println("\t[ "+y+"년 "+m+"월 ]\n");
		System.out.println(" 일 월 화 수 목 금 토");
		System.out.println(" ==================");
		
		for(i=1; i<cal.getActualMaximum(Calendar.DATE); i++) {
			System.out.printf("%4d", i);
			w++;
			
			if(w%7==1)
				System.out.println();
		}
		
		if(w%7!=1)
			System.out.println();
		
		System.out.println(" ==========================");
	}
}