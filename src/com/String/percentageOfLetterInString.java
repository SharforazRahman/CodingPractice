package com.String;
//https://leetcode.com/problems/percentage-of-letter-in-string/
public class percentageOfLetterInString {
    public static void main(String[] args) {
        String s = "foobar";
        char letter = 'o';
        System.out.println(percentageLetter(s,letter));
    }
    public static int percentageLetter(String s, char letter) {
        double count = 0;
        for (char i : s.toCharArray()) {
            if (i == letter) count++;
            else continue;
        }
        double result = (count / s.length()) * 100;
        return (int) result;
    }
}
