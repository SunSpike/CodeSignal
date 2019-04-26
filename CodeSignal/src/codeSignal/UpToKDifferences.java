package codeSignal;

import java.util.ArrayList;
import java.util.Arrays;

public class UpToKDifferences {
	public static void main(String[] args){
		int k = 3;
		int count = 0;
		
		String str = "aabeefegeeccrr";
		String temp = "";
		Character[] array = new Character[k];
		ArrayList<String> list = new ArrayList<String>();
	
		for ( int i = 0; i < str.length(); i++ ){
			if ( !Arrays.asList(array).contains(str.charAt(i)) && count < k){
				array[count] = str.charAt(i);
				temp = temp + str.charAt(i);
				count++;
			}else{
				list.add(temp);
				temp = "";
				count = 0;
				array = new Character[k];
			}
		}
		
		for ( int i = 0; i < list.size(); i++ ){
			System.out.println(list.get(i));
		}
	}
}
