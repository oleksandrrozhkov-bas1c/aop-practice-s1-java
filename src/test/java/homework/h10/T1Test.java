
package homework.h10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class T1Test {

    @Test
    void testExample() {
        T1 solution = new T1();

        char[] input = {'h', 'e', 'l', 'l', 'o'};
        char[] expected = {'o', 'l', 'l', 'e', 'h'};

        solution.reverseString(input);

        assertArrayEquals(expected, input);
    }

    @Test
    void testAnotherWord() {
        T1 solution = new T1();

        char[] input = {'a', 'b', 'c', 'd'};
        char[] expected = {'d', 'c', 'b', 'a'};

        solution.reverseString(input);

        assertArrayEquals(expected, input);
    }

    @Test
    void testSingleCharacter() {
        T1 solution = new T1();

        char[] input = {'a'};
        char[] expected = {'a'};

        solution.reverseString(input);

        assertArrayEquals(expected, input);
    }

    @Test
    void testEmptyArray() {
        T1 solution = new T1();

        char[] input = {};
        char[] expected = {};

        solution.reverseString(input);

        assertArrayEquals(expected, input);
    }
}
