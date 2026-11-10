package homework.h01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T1Test {

    @Test
    void testOddNumber() {
        T1 solution = new T1();

        assertEquals(10, solution.smallestEvenMultiple(5));
    }

    @Test
    void testEvenNumber() {
        T1 solution = new T1();

        assertEquals(6, solution.smallestEvenMultiple(6));
    }

    @Test
    void testOne() {
        T1 solution = new T1();

        assertEquals(2, solution.smallestEvenMultiple(1));
    }

    @Test
    void testTwo() {
        T1 solution = new T1();

        assertEquals(2, solution.smallestEvenMultiple(2));
    }
}
