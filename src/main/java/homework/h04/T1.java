package homework.h04;

// base
// https://leetcode.com/problems/plus-one/
public class T1 {
        public int hammingDistance(int x, int y) {
            int differentBits = x ^ y;
            return Integer.bitCount(differentBits);
        }
    }
