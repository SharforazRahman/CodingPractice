package com.SlidingWindow;
//https://practice.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeIntegerInEveryWindowSizeK {
    public static void main(String[] args) {
        int[] arr = {-8, 2, 3, -6, 10};
        int k = 2;
        System.out.println(Arrays.toString(new ArrayList[]{printFirstNegativeInteger(arr, k)}));
    }

    public static ArrayList<Long> printFirstNegativeInteger(int[] arr, int k) {
        Queue<Long> q = new LinkedList<>();
        ArrayList<Long> list = new ArrayList<>();

        int i = 0, j = 0;
        while (j < arr.length) {
            if (arr[j] < 0) q.add((long) arr[j]);
            if ((j - i + 1) < k) j++;
            else if ((j - i + 1) == k) {
                if (!q.isEmpty()) {
                    list.add(q.peek());
                    if(arr[i] == q.peek()) q.poll();
                }
                else list.add(0L);
                i++;
                j++;
            }
        }
        return list;
    }
}
