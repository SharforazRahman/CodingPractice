package com.HashMap;
//https://leetcode.com/problems/check-whether-two-strings-are-almost-equivalent/
import java.util.HashMap;

public class CheckWhetherTwoStringAreAlmostEquivalent {
    public static void main(String[] args) {
        String word = "aaaa";
        String word2 = "bccb";
        System.out.println(checkAlmostEquivalent(word,word2));
    }

    public static boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char i : word1.toCharArray()) map.put(i, map.getOrDefault(i, 0) + 1);
        for (char i : word2.toCharArray()) map.put(i, map.getOrDefault(i, 0) - 1);

        for(int i : map.values()){
            if(i > 3 || i < -3) return false;
        }
        return true;
    }
}
