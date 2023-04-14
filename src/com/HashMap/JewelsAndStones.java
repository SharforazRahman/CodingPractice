package com.HashMap;
//https://leetcode.com/problems/jewels-and-stones/
import java.util.HashMap;

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char i : stones.toCharArray()) map.put(i, map.getOrDefault(i, 0) + 1);
        int count = 0;

        for(char i : jewels.toCharArray()){
            count += map.get(i);
        }
        return count;
    }
}
