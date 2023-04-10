package com.HashMap;
//https://leetcode.com/problems/word-pattern/
import java.util.HashMap;
import java.util.Objects;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        String[] word = s.split(" ");
        if (word.length != pattern.length()) return false;

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, word[i]);
            }
            if (!map2.containsKey(word[i])) {
                map2.put(word[i], c);
            }
            if (!(Objects.equals(c, map2.get(word[i]))) || !(Objects.equals(word[i], map.get(c)))) return false;
        }
        return true;
    }
}
