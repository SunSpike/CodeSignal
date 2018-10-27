package codeSignal;

public class BuildPalindrome {
	public static void main(String[] args){
		String st = "abaa";
		String reverse = reverse(st);
		
	    int startIndex = 0;
	    int endIndex = 0;

	    while (st.charAt(startIndex) != reverse.charAt(0)){
	        startIndex++;
	    }
	  
	    try{
	        while (st.charAt(startIndex) == reverse.charAt(endIndex)){
	            startIndex++;
	            endIndex++;
	        }
	    }catch(IndexOutOfBoundsException e){
	        e.printStackTrace();
	    }

	    st = st + reverse.substring(endIndex, reverse.length());

	    System.out.println(st);
	    //have to check max value of abs(startIndex - maxIndex)
	}	
	
	static String reverse(String st){
		return new StringBuilder(st).reverse().toString();
	}
}
