
package homework.h06;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class T2Test {

    @Test
    void testValidPalindrome() {
        T2.Solution solution = new T2().new Solution();

        assertEquals(true, solution.isPalindrome("racecar"));
    }

    @Test
    void testInvalidPalindrome() {
        T2.Solution solution = new T2().new Solution();

        assertEquals(false, solution.isPalindrome("hello"));
    }

    @Test
    void testWithSpacesAndSymbols() {
        T2.Solution solution = new T2().new Solution();

        assertEquals(true, solution.isPalindrome(
                "A man, a plan, a canal: Panama"));
    }

    @Test
    void testEmptyString() {
        T2.Solution solution = new T2().new Solution();

        assertEquals(true, solution.isPalindrome(""));
    }
}
