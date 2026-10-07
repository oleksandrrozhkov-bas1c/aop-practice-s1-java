package homework.h01;

// LeetCode 2413: Smallest Even Multiple
public class T1 {
    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {
            return n;
        }
        return n * 2;
    }
}