package validationtest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class dateTest {

	@Test
	void test() {
		String d="22051996";
		String regex="^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";
		date dt= new date();
		assertTrue(dt.test(d,regex));
		
	}

}
