package com.HashMap;

import java.util.HashMap;

//https://leetcode.com/problems/replace-words/
public class ReplaceWords {
    public static void main(String[] args) {
        String[] dictionary = {"cat","bat","rat"};
        String sentence = "the cattle was rattled by the battery";

    }
    public static String replaceWords(String[] dictionary, String sentence) {
        HashMap<String,Integer> map = new HashMap<>();
        String[] s = sentence.split(" ");
        for (String i : dictionary) map.put(i,0);

      //  for(int i = 0; i < sentence.length(); i++){
           // if(s[i].contains()
       // }
        return ";";
    }
}
