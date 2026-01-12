package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Func2Test {

    @Test
    void T1_pNotZero_shouldPass() {
        String result = Func2.func2(3, 6);
        assertEquals("p=13.00, q=0.46", result);
    }

    @Test
    void T2_pZero_shouldReturnInfinity() {
        String result = Func2.func2(0, 6);
        assertEquals("p=0.00, q=Infinity", result);
    }
}
