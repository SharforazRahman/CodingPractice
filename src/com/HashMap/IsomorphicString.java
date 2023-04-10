package com.HashMap;

import java.util.HashMap;

//https://leetcode.com/problems/isomorphic-strings/
public class IsomorphicString {
    public static void main(String[] args) {
        String s = "egg", t = "add";
        System.out.println(isIsomorphic(s,t));
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();

        char[] c = s.toCharArray();
        char[] ch = t.toCharArray();

        for(int i = 0; i < c.length; i++){
            if(!map.containsKey(c[i])) map.put(c[i],ch[i]);
            if(!map2.containsKey(ch[i])) map2.put(ch[i],c[i]);

            if((c[i] != map2.get(ch[i])) || (map.get(c[i]) != ch[i])) return false;
        }
        return true;
    }
}
