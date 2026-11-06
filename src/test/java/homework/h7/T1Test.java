
package homework.h07;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T1Test {

    @Test
    void testOneNumber() {
        T1 solution = new T1();

        List<String> expected = List.of("1");

        assertEquals(expected, solution.fizzBuzz(1));
    }

    @Test
    void testFizz() {
        T1 solution = new T1();

        List<String> expected = List.of("1", "2", "Fizz");

        assertEquals(expected, solution.fizzBuzz(3));
    }

    @Test
    void testBuzz() {
        T1 solution = new T1();

        List<String> expected =
                List.of("1", "2", "Fizz", "4", "Buzz");

        assertEquals(expected, solution.fizzBuzz(5));
    }

    @Test
    void testFizzBuzz() {
        T1 solution = new T1();

        List<String> expected = List.of(
                "1", "2", "Fizz", "4", "Buzz",
                "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz"
        );

        assertEquals(expected, solution.fizzBuzz(15));
    }
}
