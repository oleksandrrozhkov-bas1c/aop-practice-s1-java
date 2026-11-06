
package homework.h12;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class T1Test {

    @Test
    void testExample() {
        T1.Solution solution = new T1().new Solution();

        int result = solution.heightChecker(
                new int[]{1, 1, 4, 2, 1, 3});

        assertEquals(3, result);
    }

    @Test
    void testSortedArray() {
        T1.Solution solution = new T1().new Solution();

        int result = solution.heightChecker(
                new int[]{1, 2, 3, 4, 5});

        assertEquals(0, result);
    }

    @Test
    void testUnsortedArray() {
        T1.Solution solution = new T1().new Solution();

        int result = solution.heightChecker(
                new int[]{5, 1, 2, 3, 4});

        assertEquals(5, result);
    }
}
