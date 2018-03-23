import java.util.Stack;

import javax.swing.JOptionPane;

public class StackExercise {
public static void main(String[] args) {
	Stack<String> stack = new Stack<String>();
	String sentence = "";
	for (int i = 0; i < 5 ; i++) {
		String word = JOptionPane.showInputDialog("type one word (to create five word sentence)");
		stack.push(word);
		
	}
	for (int i = 0; i < stack.size() ; i++) {
		System.out.println(sentence += stack.pop() + " ");
	}
	
	
}
}
