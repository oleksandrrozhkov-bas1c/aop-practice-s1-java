
package homework.h08;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class T2Test {

    @Test
    void testExample() {
        T2 solution = new T2();

        List<Integer> nums = List.of(-1, 1, 2, 3, 1);
        int target = 2;

        assertEquals(3, solution.countPairs(nums, target));
    }

    @Test
    void testSimpleNumbers() {
        T2 solution = new T2();

        List<Integer> nums = List.of(1, 2, 3);
        int target = 5;

        assertEquals(2, solution.countPairs(nums, target));
    }

    @Test
    void testNoPairs() {
        T2 solution = new T2();

        List<Integer> nums = List.of(3, 4, 5);
        int target = 3;

        assertEquals(0, solution.countPairs(nums, target));
    }

    @Test
    void testAllPairs() {
        T2 solution = new T2();

        List<Integer> nums = List.of(1, 1, 1, 1);
        int target = 3;

        assertEquals(6, solution.countPairs(nums, target));
    }
}
