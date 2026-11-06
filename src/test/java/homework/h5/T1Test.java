
package homework.h05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class T1Test {

    @Test
    void testExample() {
        T1.Solution solution = new T1().new Solution();

        int[] nums = {5, 6, 2, 7, 4};

        assertEquals(34, solution.maxProductDifference(nums));
    }

    @Test
    void testAnotherExample() {
        T1.Solution solution = new T1().new Solution();

        int[] nums = {4, 2, 5, 9, 7, 4, 8};

        assertEquals(64, solution.maxProductDifference(nums));
    }

    @Test
    void testAllEqual() {
        T1.Solution solution = new T1().new Solution();

        int[] nums = {3, 3, 3, 3};

        assertEquals(0, solution.maxProductDifference(nums));
    }

    @Test
    void testSortedNumbers() {
        T1.Solution solution = new T1().new Solution();

        int[] nums = {1, 2, 3, 4};

        assertEquals(10, solution.maxProductDifference(nums));
    }
}
