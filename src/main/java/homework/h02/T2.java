package homework.h02;

// LeetCode 2119. A Number After a Double Reversal
// https://leetcode.com/problems/a-number-after-a-double-reversal/description/
public class T2 {

    public static boolean isSameAfterReversals(int num) {
        return num == 0 || num % 10 != 0;
    }

    public static void main(String[] args) {
        System.out.println(isSameAfterReversals(526));
        System.out.println(isSameAfterReversals(1800));
        System.out.println(isSameAfterReversals(0));
    }
}
