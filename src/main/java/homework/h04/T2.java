package homework.h04;

// advanced
// https://leetcode.com/problems/number-complement/description/
public class T2 {
    class Solution {
        public int findComplement(int num) {
            int mask = Integer.highestOneBit(num);

            mask = (mask << 1) - 1;

            return num ^ mask;
        }
    }
}