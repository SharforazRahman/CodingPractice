package com.String;
//https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/

public class MaximumNumberOfWordsFoundInSentences {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }

    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String sentence : sentences) {
            max = Math.max(max, countSpaces(sentence));
        }
        return max;
    }
    public static int countSpaces(String s){
        int count = 0;
        for(String i : s.split(" ")) count++;
        return count;
    }
}
