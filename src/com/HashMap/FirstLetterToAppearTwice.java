package com.HashMap;
//https://leetcode.com/problems/first-letter-to-appear-twice/
import java.util.HashMap;

public class FirstLetterToAppearTwice {
    public static void main(String[] args) {
        String s = "abcdd";
        System.out.println(repeatedCharacter(s));
    }
    public static char repeatedCharacter(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char i : s.toCharArray()){
            if(map.containsKey(i)) return i;
            else map.put(i,-1);
        }
        return ' ';
    }
}
