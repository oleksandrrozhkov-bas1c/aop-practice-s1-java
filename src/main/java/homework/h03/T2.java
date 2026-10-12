package homework.h03;

public class T2 {

    public int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                num2 = num2 + i;
            } else {
                num1 = num1 + i;
            }
        }

        return num1 - num2;
    }

    public static void main(String[] args) {
        T2 task = new T2();

        System.out.println(task.differenceOfSums(10, 3));
    }
}