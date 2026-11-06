
package homework.h06;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class T1Test {

    @Test
    void testValidAnagram() {
        T1.Solution solution = new T1().new Solution();

        assertEquals(true, solution.isAnagram("anagram", "nagaram"));
    }

    @Test
    void testInvalidAnagram() {
        T1.Solution solution = new T1().new Solution();

        assertEquals(false, solution.isAnagram("rat", "car"));
    }

    @Test
    void testDifferentLength() {
        T1.Solution solution = new T1().new Solution();

        assertEquals(false, solution.isAnagram("abc", "ab"));
    }

    @Test
    void testEmptyStrings() {
        T1.Solution solution = new T1().new Solution();

        assertEquals(true, solution.isAnagram("", ""));
    }
}
