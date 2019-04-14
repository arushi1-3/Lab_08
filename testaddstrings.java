import static org.junit.Assert.*;

import org.junit.Test;


public class testaddstrings {

	@Test
	public void test() {
		JUnitTesting junit=new JUnitTesting();
		String sum=junit.addStrings("ABC", "DE");
		assertEquals("ABCDE",sum);
	}

}
