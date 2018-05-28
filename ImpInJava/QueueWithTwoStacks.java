package Leecode.ImpInJava;

import java.util.Stack;

public class QueueWithTwoStacks<T> {
    private Stack<T> firstStack = new Stack<>();
    private Stack<T> secondStack = new Stack<>();

    public QueueWithTwoStacks() {
    }

    public void appendTail(T tail) {
        firstStack.push(tail);
    }

    public T deleteHead() throws Exception {
        if (secondStack.size() <= 0) {
            while (firstStack.size() > 0) {
                T elem = firstStack.pop();
                secondStack.push(elem);
            }
        }
        if(secondStack.size() == 0){ throw new Exception("The queue is empty");}
        T head = secondStack.pop();
        return head;
    }
}
