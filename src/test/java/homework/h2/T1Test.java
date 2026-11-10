import org.junit.jupiter.api.Test;

class T1Test {

    @Test
    void testExample() {
        Solution solution = new Solution();

        assertEquals(2, solution.addDigits(38));
    }

    @Test
    void testZero() {
        Solution solution = new Solution();

        assertEquals(0, solution.addDigits(0));
    }

    @Test
    void testSingleDigit() {
        Solution solution = new Solution();

        assertEquals(7, solution.addDigits(7));
    }

    @Test
    void testLargeNumber() {
        Solution solution = new Solution();

        assertEquals(9, solution.addDigits(9999));
    }
}
