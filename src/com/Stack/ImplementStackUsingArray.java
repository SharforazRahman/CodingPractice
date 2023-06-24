package com.Stack;

public class ImplementStackUsingArray {
    public static void main(String[] args) {
        stack s = new stack();
        s.push(3);
        s.push(4);
        s.push(34);
        s.pop();
        s.push(67);
        System.out.println(s.peek());
        System.out.println(s.length());
        System.out.println(s.isEmpty());
    }
}

class stack {
    int[] arr = new int[1000];
    int top = -1;

    public void push(int ele) {
        top++;
        arr[top] = ele;
    }

    public int pop() {
        int ans = arr[top];
        top--;
        return ans;
    }

    public int peek() {
        return arr[top];
    }

    public int length() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
