package com.Math;

import java.util.ArrayList;

//https://leetcode.com/problems/perfect-number/
public class PerfectNumber {
    public static void main(String[] args) {
        int num = 28;
        System.out.println(checkPerfectNumber(num));
    }

    public static boolean checkPerfectNumber(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                list.add(i);
                list.add(num / i); // adding value like 28,14,7.
            }
        }
        list.remove(Integer.valueOf(num));
        int sum = 0;
        for (int i : list) sum += i;
        return sum == num;
    }
}
