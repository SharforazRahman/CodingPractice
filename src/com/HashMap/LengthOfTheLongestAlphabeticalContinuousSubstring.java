package com.HashMap;
//https://leetcode.com/problems/length-of-the-longest-alphabetical-continuous-substring/
public class LengthOfTheLongestAlphabeticalContinuousSubstring {
    public static void main(String[] args) {
        String s = "abacaba";
        System.out.println(longestContinuousSubstring(s));
    }

    public static int longestContinuousSubstring(String s) {
        int max = 1, count = 1;

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) - s.charAt(i - 1) == 1){
                count++;
                max = Math.max(max,count);
            }else count = 1;
        }
        return max;
    }
}
