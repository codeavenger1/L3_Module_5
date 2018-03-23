import static org.junit.Assert.*;

import org.junit.Test;

public class StackRevers {

	@Test
	public void test() {
		assertEquals("olleH", ReverseStack.reverse("Hello"));
		assertEquals("racecar", ReverseStack.reverse("racecar"));
		assertEquals("ananaB", ReverseStack.reverse("Banana"));

	}

}
