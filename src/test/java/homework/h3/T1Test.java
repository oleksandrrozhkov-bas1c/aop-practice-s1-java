package homework.h03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T1Test {

    @Test
    void testExample() {
        T1 solution = new T1();

        int[] salary = {4000, 3000, 1000, 2000};

        assertEquals(2500.0, solution.average(salary), 0.0001);
    }

    @Test
    void testThreeSalaries() {
        T1 solution = new T1();

        int[] salary = {1000, 2000, 3000};

        assertEquals(2000.0, solution.average(salary), 0.0001);
    }

    @Test
    void testSixSalaries() {
        T1 solution = new T1();

        int[] salary = {6000, 5000, 4000, 3000, 2000, 1000};

        assertEquals(3500.0, solution.average(salary), 0.0001);
    }

    @Test
    void testUnsortedSalaries() {
        T1 solution = new T1();

        int[] salary = {8000, 9000, 2000, 3000};

        assertEquals(5500.0, solution.average(salary), 0.0001);
    }
}
