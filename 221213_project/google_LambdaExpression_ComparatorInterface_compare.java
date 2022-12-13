import java.util.Arrays;

public class google_LambdaExpression_ComparatorInterface_compare {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		
		String[] str=new String[numbers.length];
		for(int i=0; i<numbers.length; i++) {
			str[i]=Integer.toString(numbers[i]);
		}
		
		/*
		Arrays.sort(str, new Comparator<String>() {
	          @Override
	          public int compare(String o1, String o2) {  
	            return -Integer.compare(Integer.parseInt(o1+o2),Integer.parseInt(o2+o1)); 
	            }
	        });
	    */
		Arrays.sort(str, (a,b)->{
			return (a+b).compareTo(b+a);
		});
		
		if(str[0].equals("0"))
			return "0";
		else {
			for(String s: str) {
				sb.append(s);
			}
			return sb.toString();
		}
	}

}
