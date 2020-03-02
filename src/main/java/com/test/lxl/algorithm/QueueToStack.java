package com.test.lxl.algorithm;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @description: 用队列实现栈
 * @author: Lixinling
 * @create: 2020-03-01 22:50
 **/
public class QueueToStack {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        System.out.println("top = " + myStack.top());
        System.out.println("pop = " + myStack.pop());
        System.out.println("empty = " + myStack.empty());

        for (int i = 0; i <6 ; i++) {
            myStack.push(i);
        }
        System.out.println("top = " + myStack.top());
        System.out.println("pop = " + myStack.pop());
        System.out.println("empty = " + myStack.empty());

        System.out.println("top = " + myStack.top());
        System.out.println("pop = " + myStack.pop());
        System.out.println("empty = " + myStack.empty());

        System.out.println("top = " + myStack.top());
        System.out.println("pop = " + myStack.pop());
        System.out.println("empty = " + myStack.empty());

    }}
class MyStack {
    Queue<Integer> q1 = null;
    Queue<Integer> q2 = null;
    Integer top = null;

    /** Initialize your data structure here. */
    public MyStack() {
        q1 = new LinkedList();
        q2 = new LinkedList();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        q1.add(x);
        top = x;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while(q1.size() > 1){
            top = q1.remove();
            q2.add(top);
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return q2.remove();
    }

    /** Get the top element. */
    public int top() {
        return top;
    }

    /** Returns whether the stack is empty. *//**/
    public boolean empty() {
        return q1.size() == 0;
    }

    /**
     * Your MyStack object will be instantiated and called as such:
     * MyStack obj = new MyStack();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.top();
     * boolean param_4 = obj.empty();
     */
}