package com.HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

//https://leetcode.com/problems/most-common-word/
public class MostCommonWord {
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        System.out.println(mostCommonWord(paragraph,banned));
    }

    public static String mostCommonWord(String paragraph, String[] ban) {
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>(Arrays.asList(ban));

        for (String i : paragraph.replaceAll("\\W+", " ").toLowerCase().split("\\s+")) {
            if (!set.contains(i)) map.put(i, map.getOrDefault(i, 0) + 1);
        }
        String res = "";
        int max = Integer.MIN_VALUE;
        for(String i : map.keySet()){
            if(map.get(i) > max) {
                max = map.get(i);
                res = i;
            }
        }
        return res;
    }
}
