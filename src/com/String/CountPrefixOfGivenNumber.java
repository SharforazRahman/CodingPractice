package com.String;

public class CountPrefixOfGivenNumber {
    public static void main(String[] args) {
        String[] words = {"a", "b", "c", "ab", "bc", "abc"};
        String s = "abc";
        System.out.println(countPrefixes(words, s));
    }

    public static int countPrefixes(String[] words, String s) {
        int count = 0;
        for (String i : words) {
            if (s.startsWith(i)) count++;
        }
        return count;
    }
}