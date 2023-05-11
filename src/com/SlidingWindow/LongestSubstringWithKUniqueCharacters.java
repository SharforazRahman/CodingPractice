package com.SlidingWindow;
//https://practice.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1

import java.util.HashMap;

public class LongestSubstringWithKUniqueCharacters {
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        System.out.println(longestKSubString(s, k));
    }

    public static int longestKSubString(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();

        int i = 0, j = 0, max = 0;

        while (j < s.length()) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            if (map.size() < k) j++;
            else if (map.size() == k) {
                max = Math.max(max, (j - i + 1));
                j++;
            } else {
                while (map.size() > k) {
                    char iChar = s.charAt(i);
                    int freqIChar = map.get(iChar);
                    map.put(iChar, freqIChar - 1);
                    if (map.get(iChar) == 0) map.remove(iChar);
                    i++;
                    if (map.size() == k) max = Math.max(max, (j - i + 1));
                }
                j++;
            }
        }
        return max;
    }
}
