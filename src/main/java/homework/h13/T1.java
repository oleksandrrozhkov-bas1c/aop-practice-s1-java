package homework.h13;

// https://leetcode.com/problems/first-bad-version/

public class T1 {
  private final int badVersion;

  public T1(int badVersion) {
    this.badVersion = badVersion;
  }

  private boolean isBadVersion(int version) {
    return version >= badVersion;
  }

  public int firstBadVersion(int n) {
    int left = 1;
    int right = n;

    while (left < right) {
      int mid = left + (right - left) / 2;

      if (isBadVersion(mid)) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }

    return left;
  }

  public static void main(String[] args) {
    T1 solution = new T1(4);
    System.out.println(solution.firstBadVersion(5));
  }
}
