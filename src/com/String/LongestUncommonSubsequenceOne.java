package com.String;
//https://leetcode.com/problems/longest-uncommon-subsequence-i/description/
import java.util.Objects;

public class LongestUncommonSubsequenceOne {
    public static void main(String[] args) {
        String a = "aba", b = "cdc";
        System.out.println(findLength(a,b));
    }
    public static int findLength(String a, String b) {
        if(Objects.equals(a, b)) return -1;
        else return Math.max(a.length(),b.length());
    }
}
