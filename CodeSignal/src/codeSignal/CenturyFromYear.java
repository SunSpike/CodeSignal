package codeSignal;

public class CenturyFromYear {
	public static void main(String[] args){
		int year = 1905;
		
		if ( year % 100 == 0 )
			System.out.println(year / 100);
		else
			System.out.println(year / 100 + 1);
	}
}
