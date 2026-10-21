package homework.h07;

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class T2 {

    public int numberOfSteps(int num) {
        int steps = 0;

        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }

            steps++;
        }

        return steps;
    }

    public static void main(String[] args) {
        T2 task = new T2();
        System.out.println(task.numberOfSteps(14));
    }
}
