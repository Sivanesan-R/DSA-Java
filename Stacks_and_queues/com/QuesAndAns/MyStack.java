package com.QuesAndAns;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    // protected Queue<Integer> data;
    // public MyStack() {
    //     this.data = new LinkedList<>();
    // }

    // public void push(int x) {
    //     data.add(x);
    // }

    // public int pop() {
    //     int size = data.size();
    //     for (int i = 0; i < size-1; i++) {
    //         data.add(data.remove());
    //     }
    //     return data.remove();
    // }

    // public int top() {
    //     int size = data.size();
    //     int top = -1;
    //     for (int i = 0; i < size; i++) {
    //         int val = data.remove();
    //         data.add(val);
    //         if (i == size - 1) {
    //             top = val;
    //         }
    //     }
    //     return top;
    // }

    // public boolean empty() {
    //     return data.isEmpty();
    // }

    protected Deque<Integer> stack;
    public MyQueue() {
        this.stack = new ArrayDeque<>();
    }
    
    public void push(int x) {
        stack.add(x);
    }
    
    public int pop() {
        for (int i = 0; i < stack.size()-1; i++) {
            stack.push(stack.pop());
        }
        return stack.pop();
    }
    
    public int peek() {
        return stack.peek();
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}