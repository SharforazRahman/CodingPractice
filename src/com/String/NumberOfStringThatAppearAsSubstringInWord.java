package com.String;

public class NumberOfStringThatAppearAsSubstringInWord {
    public static void main(String[] args) {
        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";
        System.out.println(numOfStrings(patterns,word));
    }
    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;

        for(String i : patterns){
            if(word.contains(i)) count++;
        }
        return count;
    }
}
