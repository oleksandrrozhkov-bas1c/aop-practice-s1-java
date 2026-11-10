package homework.h09;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T1Test {

    @Test
    void testExample() {
        T1 solution = new T1();

        int[] nums = {1, 2, 3, 1, 1, 3};

        assertEquals(4, solution.numIdenticalPairs(nums));
    }

    @Test
    void testAllEqual() {
        T1 solution = new T1();

        int[] nums = {1, 1, 1, 1};

        assertEquals(6, solution.numIdenticalPairs(nums));
    }

    @Test
    void testAllDifferent() {
        T1 solution = new T1();

        int[] nums = {1, 2, 3, 4};

        assertEquals(0, solution.numIdenticalPairs(nums));
    }

    @Test
    void testSingleNumber() {
        T1 solution = new T1();

        int[] nums = {5};

        assertEquals(0, solution.numIdenticalPairs(nums));
    }
}
