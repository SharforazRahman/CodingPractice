package com.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//https://leetcode.com/problems/uncommon-words-from-two-sentences/
public class UncommonWordsFromTwoSentence {
    public static void main(String[] args) {
        String s1 = "this apple is sweet", s2 = "this apple is sour";
        System.out.println(Arrays.toString(uncommonFromSentences(s1, s2)));
    }

    public static String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();

        for (String i : (s1 + " " + s2).split(" ")) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (String i : map.keySet()) {
            if (map.get(i) == 1) list.add(i);
        }
        return list.toArray(new String[0]);
    }
}
