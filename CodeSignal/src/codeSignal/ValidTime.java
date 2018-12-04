package codeSignal;

public class ValidTime {
	public static void main(String[] args){
		String time = "24:00";
		String[] array = time.split(":");
		
		int hour = Integer.parseInt(array[0]);
		int minute = Integer.parseInt(array[1]);
		
		if ( hour <= 23 && minute <= 59 )
			System.out.println("true");
		else
			System.out.println("false");
	}
}
