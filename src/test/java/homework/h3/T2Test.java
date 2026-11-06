
package homework.h03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class T2Test {

    @Test
    void testExample() {
        T2 solution = new T2();

        assertEquals(19, solution.differenceOfSums(10, 3));
    }

    @Test
    void testNoDivisibleNumbers() {
        T2 solution = new T2();

        assertEquals(15, solution.differenceOfSums(5, 6));
    }

    @Test
    void testEvenNumbers() {
        T2 solution = new T2();

        assertEquals(-3, solution.differenceOfSums(6, 2));
    }

    @Test
    void testAllDivisible() {
        T2 solution = new T2();

        assertEquals(-10, solution.differenceOfSums(4, 1));
    }
}
