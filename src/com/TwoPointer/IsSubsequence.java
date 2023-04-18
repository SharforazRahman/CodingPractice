package com.TwoPointer;

//https://leetcode.com/problems/is-subsequence/
public class IsSubsequence {
    public static void main(String[] args) {
        String s = "axc", t = "ahbgdc";
        System.out.println(isSubsequences(s, t));
    }

    public static boolean isSubsequences(String s, String t) {
        if (s.length() == 0) return true;

        int sPointer = 0;
        int tPointer = 0;

        while (tPointer < t.length()) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
                if (sPointer == s.length()) return true;
            }
            tPointer++;
        }
        return false;
    }
}
