package homework.h16;

//https://leetcode.com/problems/find-the-town-judge/

public class T2 {

    public int findJudge(int n, int[][] trust) {
        int[] incoming = new int[n + 1];
        int[] outgoing = new int[n + 1];

        for (int[] pair : trust) {
            int from = pair[0];
            int to = pair[1];

            outgoing[from]++;
            incoming[to]++;
        }

        for (int person = 1; person <= n; person++) {
            if (incoming[person] == n - 1 && outgoing[person] == 0) {
                return person;
            }
        }

        return -1;
    }
}