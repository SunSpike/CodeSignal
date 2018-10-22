package codeSignal;

public class DepositProfit {
	public static void main(String[] args){
		int deposit = 1;
		int rate = 100;
		int threshold = 64;
		int i = 0;
		
		double depositDouble = deposit;
		double thresDouble = threshold;
		
		while(depositDouble < thresDouble){
			i++;
			depositDouble = depositDouble + (depositDouble * rate / 100);
			System.out.println(depositDouble);
		}
		
		System.out.println(i);
	}
}
