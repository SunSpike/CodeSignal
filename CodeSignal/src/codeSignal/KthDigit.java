package codeSignal;

public class KthDigit {
	
	public static void main(String[] args){
		int n = 578943, k = 2;
		int numDigits = 0, number = n;
		while (number != 0) {
			numDigits++;
			number /= 10;
		}

		int indexFromLast = numDigits - k + 1;

		while (n != 0) {
			if (--indexFromLast == 0) {
				System.out.println(n % 10);
				return;
			}
			n /= 10;
		}

		System.out.println("-1");
	}
}
