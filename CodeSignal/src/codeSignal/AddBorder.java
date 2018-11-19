package codeSignal;

import java.util.ArrayList;

public class AddBorder {
	public static void main(String[] args){
		String[] picture = {"abc", "ded"};
		ArrayList<String> array = new ArrayList<String>();

	    String temp = "";
	    int length = picture[0].length();


	    for ( int i = 0; i < length + 2; i++ ){
	        temp = temp + "*";
	    }

	    array.add(temp);
	    for ( int i = 0; i < picture.length; i++ ){
	        array.add("*" + picture[i] + "*");
	    }
	    array.add(temp);

	    String[] returnArray = new String[array.size()];

	    for ( int i = 0; i < array.size(); i++ ){
	        returnArray[i] = array.get(i);
	    }
			
	    for( int i = 0; i < returnArray.length; i++ ){
	    	System.out.println(returnArray[i]);
	    }
	}
}
