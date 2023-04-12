package com.String;

//https://leetcode.com/problems/consecutive-characters/
public class ConsecutiveCharacter {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(maxPower(s));
    }

    public static int maxPower(String s) {
        char[] c = s.toCharArray();
        int count = 1, max = 1;

        for(int i = 0; i < c.length - 1; i++){
            if(c[i] == c[i + 1]) count++;
            else count = 1;
            max = Math.max(max,count);
        }
        return max;
    }
}
