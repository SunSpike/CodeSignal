package codeSignal;

public class GrowingPlant {
	public static void main(String[] args){
		int upSpeed = 6;
		int downSpeed = 5;
		int desiredHeight = 10;
		
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
