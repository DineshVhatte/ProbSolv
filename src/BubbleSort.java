import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BubbleSort {
	
	public static void main(String [] args) {
		   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-DD'T'HH:mm:ss:SSS'-'XXX");
		    String attDate = "2016-08-30T06:18:17:698-0600";
		    //attDate = attDate.substring(0, 19);
		    System.out.println("####attask date: "+attDate);
		    LocalDateTime dt = LocalDateTime.parse(attDate, formatter);
		    System.out.println(dt);
		int [] intArr = new int[10];
		for(int i=0; i<intArr.length;i++) {
			intArr[i] = (int) (Math.random()*20);
		}
		printArr(intArr);
		System.out.println("-----------");
		int looped=0;
		boolean swapped = true;
		for(int i=0; i<intArr.length && swapped; i++) {
			swapped = false;
			for(int j=0; j<intArr.length;j++) {
				if(intArr[i]>intArr[j]) {
					int temp = intArr[i];
					intArr[i] = intArr[j];
					intArr[j] = temp;
					swapped = true;
				}
				looped++;
			}
		}
		
		printArr(intArr);
		System.out.println(looped);
	}
	
	public static void printArr(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
