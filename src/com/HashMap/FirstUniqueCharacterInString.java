package com.HashMap;

import java.util.HashMap;

//https://leetcode.com/problems/first-unique-character-in-a-string/
public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqueChar(s));
    }

    public static int firstUniqueChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
}
