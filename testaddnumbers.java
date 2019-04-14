import static org.junit.Assert.*;

import org.junit.Test;


public class testaddnumbers {

	@Test
	public void test() {
		JUnitTesting junit=new JUnitTesting();
		int sum=junit.addnumbers(90, 60);
		assertEquals(150,sum);
	}

}
