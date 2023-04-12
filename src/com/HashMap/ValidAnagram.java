package com.HashMap;
//https://leetcode.com/problems/valid-anagram/description/
import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char i : s.toCharArray()) map.put(i, map.getOrDefault(i, 0) + 1);
        for (char i : t.toCharArray()) map.put(i, map.getOrDefault(i, 0) - 1);

        for (int i : map.values()) {
            if (i != 0) return false;
        }
        return true;
    }
}
