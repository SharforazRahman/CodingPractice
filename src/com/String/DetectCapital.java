package com.String;
//https://leetcode.com/problems/detect-capital/
public class DetectCapital {
    public static void main(String[] args) {
        String word = "USA";
        System.out.println(detectCapitalUse(word));
    }

    public static boolean detectCapitalUse(String word) {
        String cap = word.toUpperCase();
        String small = word.toLowerCase();
        String fLetter = word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();

        return word.equals(cap) || word.equals(small) || word.equals(fLetter);
    }
}