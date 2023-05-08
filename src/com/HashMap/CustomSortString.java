package com.HashMap;
//https://leetcode.com/problems/custom-sort-string/description/
import java.util.HashMap;

public class CustomSortString {
    public static void main(String[] args) {
        String order = "cbafg", s = "abcd";
        System.out.println(customSortString(order, s));
    }

    public static String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char i : s.toCharArray()) map.put(i, map.getOrDefault(i, 0) + 1);
        for (char i : order.toCharArray()) {
            if (map.containsKey(i)) {
                int freq = map.get(i);
                for(int j = 0; j < freq; j++) {
                    sb.append(i);
                }
                map.remove(i);
            }
        }

        for (char i : map.keySet()) {
            for(int j = 0; j < map.get(i); j++) sb.append(i);
        }
        return sb.toString();
    }
}
