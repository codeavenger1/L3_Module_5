import java.util.Stack;

import javax.swing.JOptionPane;

public class ReverseStack {

	public static String reverse(String word) {
		String str = "";
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < word.length(); i++) {
			stack.push(word.charAt(i));
		}
		for (int i = 0; i < word.length(); i++) {
			str += stack.pop();

		}

		return str;
	}

}
