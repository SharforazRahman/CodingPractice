package com.HashMap;
//https://leetcode.com/problems/count-common-words-with-one-occurrence/
import java.util.HashMap;

public class CountCommonWordsWithOneOccurrence {
    public static void main(String[] args) {
        String[] words1 = {"a","ab"};
        String[] words2 = {"a","a","a","ab"};
        System.out.println(countWords(words1, words2));
    }

    public static int countWords(String[] words1, String[] words2) {
        int count = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (String i : words1) map.put(i, map.getOrDefault(i, 0) + 1);
        for (String i : words2) map.put(i, map.getOrDefault(i, 0) - 1);

        for (String i : map.keySet()) {
            if (map.get(i) == 0) count++;
        }
        return count;
    }
}
