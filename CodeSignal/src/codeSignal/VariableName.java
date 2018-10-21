package codeSignal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VariableName {
	public static void main(String[] args){
		Pattern pattern;
		Matcher matcher;
		
		String name = "qq-q";
		String regex = "[a-zA-Z$_][a-zA-Z0-9$_]*";
		
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(name);
		
		System.out.println(matcher.matches());
	}
}
