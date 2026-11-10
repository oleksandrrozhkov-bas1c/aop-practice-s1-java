package homework.h15;

import homework.h15.T1.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T2Test {
    private TreeNode createTree() {
        return new TreeNode(10,
                new TreeNode(5, new TreeNode(3), new TreeNode(7)),
                new TreeNode(15, null, new TreeNode(18)));
    }

    @Test
    void sumsValuesIncludingBothBoundaries() {
        assertEquals(32, new T2().rangeSumBST(createTree(), 7, 15));
    }

    @Test
    void sumsWholeTree() {
        assertEquals(58, new T2().rangeSumBST(createTree(), 1, 20));
    }

    @Test
    void returnsZeroWhenNoValuesMatch() {
        assertEquals(0, new T2().rangeSumBST(createTree(), 11, 14));
    }

    @Test
    void searchesLeftSubtree() {
        assertEquals(15, new T2().rangeSumBST(createTree(), 3, 7));
    }

    @Test
    void searchesRightSubtree() {
        assertEquals(33, new T2().rangeSumBST(createTree(), 15, 18));
    }

    @Test
    void handlesSingleNode() {
        assertEquals(8, new T2().rangeSumBST(new TreeNode(8), 7, 9));
        assertEquals(0, new T2().rangeSumBST(new TreeNode(8), 9, 10));
    }

    @Test
    void handlesEmptyTree() {
        assertEquals(0, new T2().rangeSumBST(null, 1, 10));
    }
}
