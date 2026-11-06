
package homework.h07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T2Test {

    @Test
    void testExample() {
        T2 solution = new T2();

        assertEquals(6, solution.numberOfSteps(14));
    }

    @Test
    void testEvenNumber() {
        T2 solution = new T2();

        assertEquals(4, solution.numberOfSteps(8));
    }

    @Test
    void testZero() {
        T2 solution = new T2();

        assertEquals(0, solution.numberOfSteps(0));
    }

    @Test
    void testLargeNumber() {
        T2 solution = new T2();

        assertEquals(12, solution.numberOfSteps(123));
    }
}
