package com.HashMap;

import java.util.HashMap;

public class FindWordsThatCanBeFormedByCharacters {
    public static void main(String[] args) {
        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        System.out.println(countCharacters(words, chars));
    }

    public static int countCharacters(String[] words, String chars) {
        int count = 0;

        HashMap<Character, Integer> cMap = new HashMap<>();
        for (char i : chars.toCharArray()) cMap.put(i, cMap.getOrDefault(i, 0) + 1);

        for (String word : words) {
            HashMap<Character, Integer> wMap = new HashMap<>();
            for(char i : word.toCharArray()) wMap.put(i, wMap.getOrDefault(i, 0) + 1);
            boolean flag = true;

            for (Character ch : wMap.keySet()) {
                if (cMap.containsKey(ch) && cMap.get(ch) >= wMap.get(ch)) {
                    continue;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count += word.length();
            }
        }
        return count;
    }
}
