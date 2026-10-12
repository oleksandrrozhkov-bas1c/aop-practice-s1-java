package homework.h02;

// LeetCode 258. Add Digits
// https://leetcode.com/problems/add-digits/
public class T1 {

    public static int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            num = sum;
        }

        return num;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(38));
        System.out.println(addDigits(0));
    }
}
