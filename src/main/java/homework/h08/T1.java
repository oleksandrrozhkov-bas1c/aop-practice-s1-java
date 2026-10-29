package homework.h08;

//https://leetcode.com/problems/max-consecutive-ones/
public class T1 {
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int count = 0;
            int max = 0;

            for (int num : nums) {
                if (num == 1) {
                    count++;
                    max = Math.max(max, count);
                } else {
                    count = 0;
                }
            }

            return max;
        }
    }

}
