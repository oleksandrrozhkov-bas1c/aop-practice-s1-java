package homework.h09;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T2Test {

    @Test
    void testExample() {
        T2 solution = new T2();

        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        List<Boolean> expected =
                List.of(true, true, true, false, true);

        assertEquals(expected,
                solution.kidsWithCandies(candies, extraCandies));
    }

    @Test
    void testSecondExample() {
        T2 solution = new T2();

        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;

        List<Boolean> expected =
                List.of(true, false, false, false, false);

        assertEquals(expected,
                solution.kidsWithCandies(candies, extraCandies));
    }

    @Test
    void testWithoutExtraCandies() {
        T2 solution = new T2();

        int[] candies = {2, 5, 5};
        int extraCandies = 0;

        List<Boolean> expected =
                List.of(false, true, true);

        assertEquals(expected,
                solution.kidsWithCandies(candies, extraCandies));
    }

    @Test
    void testAllEqual() {
        T2 solution = new T2();

        int[] candies = {1, 1, 1};
        int extraCandies = 0;

        List<Boolean> expected =
                List.of(true, true, true);

        assertEquals(expected,
                solution.kidsWithCandies(candies, extraCandies));
    }
}
