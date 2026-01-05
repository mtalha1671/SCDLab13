package Lab09_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class findMax {

	@Test
	void test() {
		JUnitTesting obj = new JUnitTesting();
		int output = obj.findMaxi(new int[]{1,3,4,0,-1});
		assertEquals(4, output);
	}

}







