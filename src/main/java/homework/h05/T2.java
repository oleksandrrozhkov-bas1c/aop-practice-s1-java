package homework.h05;

// advanced
// https://leetcode.com/problems/squares-of-a-sorted-array/description/
public class T2 {
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int[] result = new int[nums.length];

            int left = 0;
            int right = nums.length - 1;
            int index = nums.length - 1;

            while (left <= right) {
                int leftSquare = nums[left] * nums[left];
                int rightSquare = nums[right] * nums[right];

                if (leftSquare > rightSquare) {
                    result[index] = leftSquare;
                    left++;
                } else {
                    result[index] = rightSquare;
                    right--;
                }

                index--;
            }

            return result;
        }
    }
}

