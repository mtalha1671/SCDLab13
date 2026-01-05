package Lab09_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class findMin {

	@Test
	void test() {
		
		JUnitTesting obj = new JUnitTesting();
		int output = obj.findMini(new int[]{1,3,4,0,-1});
		assertEquals(-1, output);

	}

}




