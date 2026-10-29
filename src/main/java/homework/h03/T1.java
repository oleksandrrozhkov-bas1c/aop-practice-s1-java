package homework.h03;

//https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/description/
public class T1 {

    public double average(int[] salary) {
        int sum = 0;
        int min = salary[0];
        int max = salary[0];

        for (int value : salary) {
            sum = sum + value;

            if (value < min) {
                min = value;
            }

            if (value > max) {
                max = value;
            }
        }

        return (double) (sum - min - max) / (salary.length - 2);
    }

    public static void main(String[] args) {
        T1 task = new T1();
        int[] salary = {4000, 3000, 1000, 2000};

        System.out.println(task.average(salary));
    }
}