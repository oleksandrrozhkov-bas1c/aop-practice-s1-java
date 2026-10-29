package homework.h10;

//https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/description/

public class T2 {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");

        while (word.length() < k) {
            int length = word.length();

            for (int i = 0; i < length; i++) {
                char c = word.charAt(i);
                char next = (char) ('a' + (c - 'a' + 1) % 26);
                word.append(next);
            }
        }

        return word.charAt(k - 1);
    }
}
