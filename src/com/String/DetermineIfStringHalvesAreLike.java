package com.String;

//https://leetcode.com/problems/determine-if-string-halves-are-alike/
public class DetermineIfStringHalvesAreLike {
    public static void main(String[] args) {
        String s = "textbook";
        System.out.println(halvesAreAlike(s));
    }

    protected static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public static boolean halvesAreAlike(String s) {
        int checkingHalves = 0;

        for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
            if (isVowel(s.charAt(i))) checkingHalves++;
            if (isVowel(s.charAt(j))) checkingHalves--;
        }
        return checkingHalves == 0;
    }
}
