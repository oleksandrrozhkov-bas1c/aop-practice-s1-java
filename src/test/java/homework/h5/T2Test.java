
package homework.h05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class T2Test {

    @Test
    void testExample() {
        T2.Solution solution = new T2().new Solution();

        int[] nums = {-4, -1, 0, 3, 10};
        int[] expected = {0, 1, 9, 16, 100};

        assertArrayEquals(expected, solution.sortedSquares(nums));
    }

    @Test
    void testAnotherExample() {
        T2.Solution solution = new T2().new Solution();

        int[] nums = {-7, -3, 2, 3, 11};
        int[] expected = {4, 9, 9, 49, 121};

        assertArrayEquals(expected, solution.sortedSquares(nums));
    }

    @Test
    void testOnlyPositiveNumbers() {
        T2.Solution solution = new T2().new Solution();

        int[] nums = {1, 2, 3, 4};
        int[] expected = {1, 4, 9, 16};

        assertArrayEquals(expected, solution.sortedSquares(nums));
    }

    @Test
    void testOnlyNegativeNumbers() {
        T2.Solution solution = new T2().new Solution();

        int[] nums = {-5, -3, -1};
        int[] expected = {1, 9, 25};

        assertArrayEquals(expected, solution.sortedSquares(nums));
    }
}
