package com.HashMap;

import java.util.HashMap;
import java.util.HashSet;

//https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/
public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    public static void main(String[] args) {
        String s = "aaabb";
        System.out.println(areOccurrencesEqual(s));
    }

    public static boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char i : s.toCharArray()) map.put(i, map.getOrDefault(i, 0) + 1);
        HashSet<Integer> set = new HashSet<>(map.values());

        return set.size() == 1;
    }
}
