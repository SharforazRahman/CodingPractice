package com.String;
//https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/
public class CheckIfWordOccursAsPrefixOfAnyWordInSentence {
    public static void main(String[] args) {
        String sentence = "i love eating burger", searchWord = "burg";
        System.out.println(isPrefixOfWord(sentence,searchWord));
    }
    public static int isPrefixOfWord(String sentence, String searchWord) {
        int iterate = 0,idx = 0;
        for(String i : sentence.split(" ")){
            iterate++;
            if(i.startsWith(searchWord)) {
                idx = iterate;
                break;
            }
        }
        return idx;
    }
}
