package data_structures;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS
	// A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) { //{}
		Stack<Character> brackets = new Stack<Character>();

		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(0)== '}') {
				brackets.push('}');
			}
			if (b.charAt(i) == '{') {
				brackets.push('{');
			}
			
			if (b.charAt(i) == '}') {
				brackets.pop();
			}

			
		
		}
if (brackets.isEmpty() == true) {
	return true;
}
//else if (!brackets.isEmpty()) {
//return false;
//} 
System.out.println(brackets);
		return false;
	}

}