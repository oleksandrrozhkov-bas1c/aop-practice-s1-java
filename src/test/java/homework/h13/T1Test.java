package homework.h13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T1Test {
    @Test
    void firstVersionIsBad() {
        assertEquals(1, new T1(1).firstBadVersion(5));
    }

    @Test
    void badVersionIsInTheMiddle() {
        assertEquals(4, new T1(4).firstBadVersion(5));
    }

    @Test
    void handlesMaximumVersionNumber() {
        assertEquals(
                Integer.MAX_VALUE,
                new T1(Integer.MAX_VALUE).firstBadVersion(Integer.MAX_VALUE)
        );
    }
}