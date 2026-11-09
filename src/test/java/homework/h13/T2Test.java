package homework.h13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T2Test {
    private final T2 solution = new T2();

    @Test
    void equalPositiveAndNegativeCounts() {
        assertEquals(3, solution.maximumCount(new int[]{-2, -1, -1, 1, 2, 3}));
    }

    @Test
    void ignoresZeros() {
        assertEquals(3, solution.maximumCount(new int[]{-3, -2, -1, 0, 0, 1, 2}));
    }

    @Test
    void allPositive() {
        assertEquals(4, solution.maximumCount(new int[]{5, 20, 66, 1314}));
    }

    @Test
    void allNegative() {
        assertEquals(3, solution.maximumCount(new int[]{-3, -2, -1}));
    }

    @Test
    void onlyZeros() {
        assertEquals(0, solution.maximumCount(new int[]{0, 0, 0}));
    }
}