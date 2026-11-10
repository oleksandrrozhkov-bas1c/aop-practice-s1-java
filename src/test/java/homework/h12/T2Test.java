package homework.h12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class T2Test {

    @Test
    void testExample() {
        T2.Solution solution = new T2().new Solution();

        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};

        int[] expected = {2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19};

        assertArrayEquals(expected,
                solution.relativeSortArray(arr1, arr2));
    }

    @Test
    void testWithoutPriority() {
        T2.Solution solution = new T2().new Solution();

        int[] arr1 = {5, 2, 3, 2};
        int[] arr2 = {};

        int[] expected = {2, 2, 3, 5};

        assertArrayEquals(expected,
                solution.relativeSortArray(arr1, arr2));
    }
}
