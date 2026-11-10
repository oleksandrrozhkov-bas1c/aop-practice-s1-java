package homework.h14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T2Test {
    @Test
    void newQueueIsEmpty() {
        assertTrue(new T2().empty());
    }

    @Test
    void removesElementsInInsertionOrder() {
        T2 queue = new T2();
        queue.push(1);
        queue.push(2);
        queue.push(3);

        assertFalse(queue.empty());
        assertEquals(1, queue.pop());
        assertEquals(2, queue.pop());
        assertEquals(3, queue.pop());
        assertTrue(queue.empty());
    }

    @Test
    void peekDoesNotRemoveElement() {
        T2 queue = new T2();
        queue.push(7);

        assertEquals(7, queue.peek());
        assertEquals(7, queue.peek());
        assertFalse(queue.empty());
        assertEquals(7, queue.pop());
        assertTrue(queue.empty());
    }

    @Test
    void supportsMixedPushAndPop() {
        T2 queue = new T2();
        queue.push(1);
        queue.push(2);
        assertEquals(1, queue.pop());

        queue.push(3);
        assertEquals(2, queue.peek());
        assertEquals(2, queue.pop());
        assertFalse(queue.empty());
        assertEquals(3, queue.pop());
        assertTrue(queue.empty());
    }

    @Test
    void canBeReusedAfterBecomingEmpty() {
        T2 queue = new T2();
        queue.push(5);
        assertEquals(5, queue.pop());
        queue.push(0);
        queue.push(0);

        assertEquals(0, queue.pop());
        assertFalse(queue.empty());
        assertEquals(0, queue.pop());
        assertTrue(queue.empty());
    }
}
