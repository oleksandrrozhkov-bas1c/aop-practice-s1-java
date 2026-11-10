package homework.h16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T2Test {
    @Test
    void findsJudgeAmongTwoPeople() {
        assertEquals(2, new T2().findJudge(2, new int[][]{{1, 2}}));
    }

    @Test
    void findsJudgeAmongThreePeople() {
        assertEquals(3, new T2().findJudge(3, new int[][]{{1, 3}, {2, 3}}));
    }

    @Test
    void rejectsCandidateWhoTrustsSomeone() {
        int[][] trust = {{1, 3}, {2, 3}, {3, 1}};
        assertEquals(-1, new T2().findJudge(3, trust));
    }

    @Test
    void rejectsCandidateNotTrustedByEveryone() {
        assertEquals(-1, new T2().findJudge(3, new int[][]{{1, 3}}));
    }

    @Test
    void singlePersonIsJudge() {
        assertEquals(1, new T2().findJudge(1, new int[][]{}));
    }

    @Test
    void noJudgeWithoutTrustAmongSeveralPeople() {
        assertEquals(-1, new T2().findJudge(3, new int[][]{}));
    }

    @Test
    void judgeCanHaveFirstNumber() {
        assertEquals(1, new T2().findJudge(3, new int[][]{{2, 1}, {3, 1}}));
    }
}
