package com.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//https://leetcode.com/problems/find-and-replace-pattern/
public class FindAndReplacePattern {
    public static void main(String[] args) {
        String[] words = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String pattern = "abb";
        System.out.println(findAndReplacePattern(words,pattern));
    }

    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> list = new ArrayList<>();
        for (String word : words) {
            if (isIsomorphic(word, pattern)) {
                list.add(word);
            }
        }
        return list;
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        char[] c = s.toCharArray();
        char[] ch = t.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (!map.containsKey(c[i])) map.put(c[i], ch[i]);
            if (!map2.containsKey(ch[i])) map2.put(ch[i], c[i]);

            if ((c[i] != map2.get(ch[i])) || (map.get(c[i]) != ch[i])) return false;
        }
        return true;
    }
}
