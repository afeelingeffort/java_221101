import java.util.Random;
import java.util.Scanner;

public class google_array_bubbleArray {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		Random r=new Random();
		
		int arr[]= new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i]=r.nextInt(100)+1;
		}
		
		System.out.print("정렬 전 리스트: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		
		System.out.println();
		System.out.print("정렬 후 리스트: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
