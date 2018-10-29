package codeSignal;

import java.util.LinkedList;

public class RegularBracketSequence2 {
	public static void main(String[] args){
		String sequence = "[(())]";
		LinkedList<Character> stack = new LinkedList<>();
		
		for (int i = 0; i < sequence.length(); i++) {
			if (stack.size() > 0
					&& stack.getLast() == '(' && sequence.charAt(i) == ')' ) {
				stack.pollLast();
				continue;
			}
			
			if (stack.size() > 0
					&& stack.getLast() == '[' && sequence.charAt(i) == ']') {
				stack.pollLast();
				continue;
			}
			
			stack.addLast(sequence.charAt(i));
		}

		if (stack.size() != 0) {
			System.out.println("false");
		}
		
		System.out.println("true");
	}
}
