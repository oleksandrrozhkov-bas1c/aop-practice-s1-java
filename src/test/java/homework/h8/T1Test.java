package homework.h08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T1Test {

    @Test
    void testExample() {
        T1.Solution solution = new T1().new Solution();

        int[] nums = {1, 1, 0, 1, 1, 1};

        assertEquals(3, solution.findMaxConsecutiveOnes(nums));
    }

    @Test
    void testAllOnes() {
        T1.Solution solution = new T1().new Solution();

        int[] nums = {1, 1, 1, 1};

        assertEquals(4, solution.findMaxConsecutiveOnes(nums));
    }

    @Test
    void testAllZeros() {
        T1.Solution solution = new T1().new Solution();

        int[] nums = {0, 0, 0, 0};

        assertEquals(0, solution.findMaxConsecutiveOnes(nums));
    }

    @Test
    void testMixedNumbers() {
        T1.Solution solution = new T1().new Solution();

        int[] nums = {1, 0, 1, 1, 0, 1};

        assertEquals(2, solution.findMaxConsecutiveOnes(nums));
    }
}
