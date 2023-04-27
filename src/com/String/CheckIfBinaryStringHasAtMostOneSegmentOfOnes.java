package com.String;
//https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/description/
public class CheckIfBinaryStringHasAtMostOneSegmentOfOnes {
    public static void main(String[] args) {
        String s = "1001";
        System.out.println(checkOnesSegment(s));
    }
    public static boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
}
