package com.String;
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/
import java.util.HashSet;
import java.util.Set;

public class checkIfSentenceIsPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
    public static boolean checkIfPangram(String s){
        Set<Character> set = new HashSet<>();
        for(char i : s.toCharArray()) set.add(i);
        return set.size() >= 26;
    }
}
