package com.Math;
//https://leetcode.com/problems/perfect-number/

public class PerfectNumber {
    public static void main(String[] args) {
        int num = 28;
        System.out.println(checkPerfectNumber(num));
    }

    public static boolean checkPerfectNumber(int num) {
        int sum = -num;
        for(int i = 1; i < Math.sqrt(num); i++){
            if(num % i == 0) sum += i + (num / i);
        }
        return sum == num;
    }
}
