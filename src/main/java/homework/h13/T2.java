package homework.h13;

// https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/submissions/2192418694/

public class T2 {
  public int maximumCount(int[] nums) {
    int negativeCount = firstAtLeast(nums, 0);
    int positiveCount = nums.length - firstAtLeast(nums, 1);

    return Math.max(negativeCount, positiveCount);
  }

  private int firstAtLeast(int[] nums, int target) {
    int left = 0;
    int right = nums.length;

    while (left < right) {
      int mid = left + (right - left) / 2;

      if (nums[mid] < target) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }

    return left;
  }
}
