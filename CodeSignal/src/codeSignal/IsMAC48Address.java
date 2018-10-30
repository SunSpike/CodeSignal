package codeSignal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsMAC48Address {
	public static void main(String[] args){
		String inputString = "00-1B-63-84-45-E6";
		Pattern p = Pattern.compile("^([0-9A-F]{2}[:-]){5}([0-9A-F]{2})$");
		Matcher m = p.matcher(inputString);
		
		System.out.println(m.matches());
	}
}
