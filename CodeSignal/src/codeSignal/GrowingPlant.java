package codeSignal;

public class GrowingPlant {
	public static void main(String[] args){
		int upSpeed = 100;
		int downSpeed = 10;
		int desiredHeight = 910;
		
		int height = 0;
	    int dayCount = 0;

	    while ( height < desiredHeight ){
	        height = height + upSpeed;
	        dayCount++;
	        if ( height >= desiredHeight)
	            break;

	        height = height - downSpeed;
	    }

	    System.out.println(dayCount);
	}
}
