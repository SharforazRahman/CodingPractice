package com.Queue;

public class ImplementQueueUsingArray {
    public static void main(String[] args) {
        Queue q = new Queue(6);
        q.push(4);
        q.push(14);
        q.push(24);
        q.push(34);
        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.peek());
        System.out.println(q.length());

    }
}

class Queue {
    int[] arr;
    int start, end, currentSize, maxSize;

    Queue() {
        arr = new int[16];
        start = -1;
        end = -1;
        currentSize = 0;
    }

    Queue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        start = -1;
        end = -1;
        currentSize = 0;
    }

    void push(int ele) {
        if (currentSize == maxSize) {
            System.out.println("Queue is Currently Full");
            System.exit(1);
        }
        if (end == -1) {
            start = 0;
            end = 0;
        } else {
            end = (end + 1) % maxSize;
        }
        arr[end] = ele;
        System.out.println("New Element has been pushed");
        currentSize++;
    }

    int pop() {
        if (start == -1) {
            System.out.println("Queue is already empty");
            System.exit(1);
        }
        int popped = arr[start];
        if (currentSize == 1) {
            start = -1;
            end = -1;
        } else {
            start = (start + 1) % maxSize;
        }
        currentSize--;
        return popped;
    }

    int peek() {
        if (start == -1) {
            System.out.println("Queue is Empty");
            System.exit(1);
        }
        return arr[start];
    }

    int length() {
        return currentSize;
    }

    boolean isEmpty() {
        return end == -1;
    }
}
