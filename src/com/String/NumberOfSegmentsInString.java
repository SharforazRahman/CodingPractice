package com.String;
//https://leetcode.com/problems/number-of-segments-in-a-string/
public class NumberOfSegmentsInString {
    public static void main(String[] args) {
        String s = "Hello, my name is John";
        System.out.println(countSegments(s));
    }

    public static int countSegments(String s) {
        String[] arr = s.replaceAll("\\W"," ").trim().split("\\s+");
        return arr.length;
    }
}
