package com.Array;
//https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/description/
public class AverageSalaryExcludingMinimumAndMaximumSalary {
    public static void main(String[] args) {
        int[] arr = {4000, 3000, 1000, 2000};
        System.out.println(average(arr));
    }

    public static double average(int[] salary) {
        double beton = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int j : salary) {
            beton += j;
            min = Math.min(min, j);
            max = Math.max(max, j);
        }
        return (beton - min - max) / (salary.length - 2);
    }
}
