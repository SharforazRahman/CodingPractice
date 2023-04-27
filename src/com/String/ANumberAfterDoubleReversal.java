package com.String;
//https://leetcode.com/problems/a-number-after-a-double-reversal/
public class ANumberAfterDoubleReversal {
    public static void main(String[] args) {
        int num = 1800;
        System.out.println(isSameAfterReversals(num));
    }
    public static boolean isSameAfterReversals(int num) {
        String s = num+"";
        if(s.charAt(0) == '0') return true;
        return s.charAt(s.length() - 1) != '0';
    }
}
