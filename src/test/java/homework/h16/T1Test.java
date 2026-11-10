package homework.h16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class T1Test {
    @Test
    void fillsOnlyConnectedArea() {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int[][] expected = {{2, 2, 2}, {2, 2, 0}, {2, 0, 1}};

        assertArrayEquals(expected, new T1().floodFill(image, 1, 1, 2));
    }

    @Test
    void keepsImageWhenColorIsUnchanged() {
        int[][] image = {{0, 0}, {0, 1}};
        int[][] expected = {{0, 0}, {0, 1}};

        assertArrayEquals(expected, new T1().floodFill(image, 0, 0, 0));
    }

    @Test
    void doesNotConnectDiagonalPixels() {
        int[][] image = {{1, 0}, {0, 1}};
        int[][] expected = {{2, 0}, {0, 1}};

        assertArrayEquals(expected, new T1().floodFill(image, 0, 0, 2));
    }

    @Test
    void fillsRectangularImageFromCorner() {
        int[][] image = {{1, 1, 1}, {1, 1, 1}};
        int[][] expected = {{3, 3, 3}, {3, 3, 3}};

        assertArrayEquals(expected, new T1().floodFill(image, 1, 2, 3));
    }

    @Test
    void handlesSinglePixel() {
        assertArrayEquals(new int[][]{{5}},
                new T1().floodFill(new int[][]{{0}}, 0, 0, 5));
    }
}
