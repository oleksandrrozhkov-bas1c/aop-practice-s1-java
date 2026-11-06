
package homework.h11;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class T1Test {

    @Test
    void testExample() {
        T1.Solution solution = new T1().new Solution();

        int[] nums = {3, 2, 3};

        assertEquals(3, solution.majorityElement(nums));
    }

    @Test
    void testManyNumbers() {
        T1.Solution solution = new T1().new Solution();

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        assertEquals(2, solution.majorityElement(nums));
    }

    @Test
    void testSingleNumber() {
        T1.Solution solution = new T1().new Solution();

        int[] nums = {7};

        assertEquals(7, solution.majorityElement(nums));
    }

    @Test
    void testNegativeNumbers() {
        T1.Solution solution = new T1().new Solution();

        int[] nums = {-1, -1, 2};

        assertEquals(-1, solution.majorityElement(nums));
    }
}
