
package homework.h02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class T2Test {

    @Test
    void testExample() {
        assertEquals(true, T2.isSameAfterReversals(526));
    }

    @Test
    void testTrailingZeros() {
        assertEquals(false, T2.isSameAfterReversals(1800));
    }

    @Test
    void testZero() {
        assertEquals(true, T2.isSameAfterReversals(0));
    }

    @Test
    void testNumberEndingInZero() {
        assertEquals(false, T2.isSameAfterReversals(10));
    }
}
