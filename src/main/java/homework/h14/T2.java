package homework.h14;

import java.util.Stack;

// https://leetcode.com/problems/implement-queue-using-stacks/

public class T2 {
    private final Stack<Integer> incoming = new Stack<>();
    private final Stack<Integer> outgoing = new Stack<>();

    public void push(int x) {
        incoming.push(x);
    }

    public int pop() {
        prepareFront();
        return outgoing.pop();
    }

    public int peek() {
        prepareFront();
        return outgoing.peek();
    }

    public boolean empty() {
        return incoming.isEmpty() && outgoing.isEmpty();
    }

    private void prepareFront() {
        if (outgoing.isEmpty()) {
            while (!incoming.isEmpty()) {
                outgoing.push(incoming.pop());
            }
        }
    }
}