
package homework.h04;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class T1Test {

    @Test
    void testExample() {
        T1.Solution solution = new T1().new Solution();

        assertEquals(2, solution.hammingDistance(1, 4));
    }

    @Test
    void testOneDifferentBit() {
        T1.Solution solution = new T1().new Solution();

        assertEquals(1, solution.hammingDistance(3, 1));
    }

    @Test
    void testSameNumbers() {
        T1.Solution solution = new T1().new Solution();

        assertEquals(0, solution.hammingDistance(7, 7));
    }

    @Test
    void testAllDifferentBits() {
        T1.Solution solution = new T1().new Solution();

        assertEquals(4, solution.hammingDistance(10, 5));
    }
}
