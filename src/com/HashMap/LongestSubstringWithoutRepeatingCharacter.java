package com.HashMap;
//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        String s = "abcaabcdba";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        char[] c = s.toCharArray();
        int i = 0, j = 0, max = 0;

        while (j < c.length){
            if(!set.contains(c[j])){
                set.add(c[j]);
                j++;
                max = Math.max(max,set.size());
            }else {
                set.remove(c[i]);
                i++;
            }
        }
        return max;
    }
}
