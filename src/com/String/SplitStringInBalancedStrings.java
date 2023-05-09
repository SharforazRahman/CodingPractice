package com.String;
//https://leetcode.com/problems/split-a-string-in-balanced-strings/
public class SplitStringInBalancedStrings {
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }
    public static int balancedStringSplit(String s) {
        int count = 0,balanceCount = 0;

        for(char i : s.toCharArray()){
            if(i == 'R') count++;
            else count--;
            if(count == 0) balanceCount++;
        }
        return balanceCount;
    }
}
