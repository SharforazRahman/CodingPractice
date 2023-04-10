package com.HashMap;
//https://leetcode.com/problems/count-the-number-of-consistent-strings/
import java.util.HashMap;

public class CountTheNumberOfConsistentStrings {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        System.out.println(countConsistentStrings(allowed,words));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char i : allowed.toCharArray()) map.put(i,-1);
        int count = 0;
        outer:
        for (String word : words) {
            for (char j : word.toCharArray()) {
                if (!map.containsKey(j)) continue outer;
            }
            count++;
        }
        return count;
    }
}
