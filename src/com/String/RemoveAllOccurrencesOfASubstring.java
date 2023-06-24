package com.String;
//https://leetcode.com/problems/remove-all-occurrences-of-a-substring/

public class RemoveAllOccurrencesOfASubstring {
    public static void main(String[] args) {
        String s = "daabcbaabcbc", part = "abc";
        System.out.println(removeOccurrences(s,part));
    }
    public static String removeOccurrences(String s, String part) {
        while (s.contains(part)) s = s.replaceFirst(part,"");
        return s;
    }
}
