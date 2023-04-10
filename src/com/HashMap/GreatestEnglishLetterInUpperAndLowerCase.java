package com.HashMap;

import java.util.HashMap;

public class GreatestEnglishLetterInUpperAndLowerCase {
    public static void main(String[] args) {
        String s = "AbCdEfGhIjK";
        System.out.println(greatestLetter(s));
    }
    public static String greatestLetter(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        for(int i = c.length - 1; i >= 0; i--){
            if(map.containsKey(Character.toUpperCase(c[i])) && map.containsKey(Character.toLowerCase(c[i]))) sb.append(c[i]);
            else map.put(c[i],i);
        }
        char max = ' ';
        for(char i : sb.toString().toCharArray()){
            max = (char) Math.max(max,i);
        }
        if(sb.isEmpty()) return "";
        else return Character.toUpperCase(max)+"";
    }
}
