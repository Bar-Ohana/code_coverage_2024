package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



public class Func3Test {

    @Test
    void T1_xPositive_shouldThrowException() {
        assertThrows(ArithmeticException.class, () -> {
            Func3.func3(1);
        });
    }

    @Test
    void T2_xNegative_shouldThrowException() {
        assertThrows(ArithmeticException.class, () -> {
            Func3.func3(-1);
        });
    }

    @Test
    void T3_xTen_shouldThrowException() {
        assertThrows(ArithmeticException.class, () -> {
            Func3.func3(10);
        });
    }

}
