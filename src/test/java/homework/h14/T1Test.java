package homework.h14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T1Test {
    @Test
    void removesDuplicatesRepeatedly() {
        assertEquals("ca", new T1().removeDuplicates("abbaca"));
    }

    @Test
    void removesDuplicatesInTheMiddle() {
        assertEquals("ay", new T1().removeDuplicates("azxxzy"));
    }

    @Test
    void keepsStringWithoutDuplicates() {
        assertEquals("abc", new T1().removeDuplicates("abc"));
    }

    @Test
    void removesAllCharacters() {
        assertEquals("", new T1().removeDuplicates("abba"));
    }

    @Test
    void keepsSingleCharacter() {
        assertEquals("a", new T1().removeDuplicates("a"));
    }

    @Test
    void keepsOneCharacterFromOddGroup() {
        assertEquals("a", new T1().removeDuplicates("aaa"));
    }
}
