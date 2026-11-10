package homework.h04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T2Test {

    @Test
    void testExample() {
        T2.Solution solution = new T2().new Solution();

        assertEquals(2, solution.findComplement(5));
    }

    @Test
    void testOne() {
        T2.Solution solution = new T2().new Solution();

        assertEquals(0, solution.findComplement(1));
    }

    @Test
    void testTen() {
        T2.Solution solution = new T2().new Solution();

        assertEquals(5, solution.findComplement(10));
    }

    @Test
    void testPowerOfTwo() {
        T2.Solution solution = new T2().new Solution();

        assertEquals(7, solution.findComplement(8));
    }
}
