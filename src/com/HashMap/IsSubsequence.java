package com.HashMap;
//https://leetcode.com/problems/is-subsequence/
import java.util.HashMap;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "axc", t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }

    public static boolean isSubsequence(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char i : t.toCharArray()) map.put(i,0);
        for(char i : s.toCharArray()){
            if(!map.containsKey(i)) return false;
        }
        return true;
    }
}
