package com.SlidingWindow;
//https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/
public class MaximumNumberOfVowelsInSubstringOfGivenLength {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s, k));
    }

    public static int maxVowels(String s, int k) {
        int count = 0, max = Integer.MIN_VALUE;

        for(int i = 0; i < k; i++) {
            if(checkVowel(s.charAt(i))) count++;
        }
        max = count;
        for(int i = k; i < s.length(); i++) {
            if(checkVowel(s.charAt(i - k))) count--;
            if(checkVowel(s.charAt(i))) count++;
            max = Math.max(max, count);
        }
        return max;
    }

    public static boolean checkVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
