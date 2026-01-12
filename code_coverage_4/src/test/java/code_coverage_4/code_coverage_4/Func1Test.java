package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class Func1Test {

	@Test
    public void T1_xNotZero_yZero_shouldPass() {
		int result = Func1.func1(2, 0, 10);
		assertEquals(0, result);
	}

	@Test
    public void T2_xZero_shouldThrowException() {
		assertThrows(ArithmeticException.class, () -> {
			Func1.func1(0, 1, 10);
		});
	}
}


