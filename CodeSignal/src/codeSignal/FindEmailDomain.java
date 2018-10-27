package codeSignal;

public class FindEmailDomain {
	public static void main(String[] args){
		String address = "John.Smith@example.com";
		System.out.println(address.split("@")[address.split("@").length-1]);
	}
}
