package com.SlidingWindow;
//https://leetcode.com/problems/fruit-into-baskets/description/
import java.util.HashMap;
import java.util.Map;

public class fruitsIntoBaskets {
    public static void main(String[] args) {
        int[] arr = {1, 1};
        System.out.println(totalFruit(arr));
    }

    public static int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0, j = 0, max = 1;

        while (j < fruits.length) {
            map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);
            if (map.size() < 2) j++;
            else if (map.size() == 2) {
                max = Math.max(max, (j - i + 1));
                j++;
            } else {
                while (map.size() > 2) {
                    int key = fruits[i];
                    int freq = map.get(key);
                    map.put(key, freq - 1);
                    if (map.get(key) == 0) map.remove(key);
                    i++;
                    if (map.size() == 2) max = Math.max(max, (j - i + 1));
                }
                j++;
            }
        }
        if (map.size() == 1) {
            return map.getOrDefault(map.keySet().iterator().next(), -1);
        }
        return max;
    }
}
