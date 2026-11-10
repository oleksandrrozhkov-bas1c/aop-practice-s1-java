package homework.h01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T2Test {

    @Test
    void testExample() {
        T2 solution = new T2();

        assertEquals(3, solution.countOdds(3, 7));
    }

    @Test
    void testEvenRange() {
        T2 solution = new T2();

        assertEquals(1, solution.countOdds(8, 10));
    }

    @Test
    void testSingleOddNumber() {
        T2 solution = new T2();

        assertEquals(1, solution.countOdds(5, 5));
    }

    @Test
    void testSingleEvenNumber() {
        T2 solution = new T2();

        assertEquals(0, solution.countOdds(2, 2));
    }
}
