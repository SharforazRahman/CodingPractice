package com.String;
//https://leetcode.com/problems/reverse-string/
public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o', 'i', 'a', 'm', 'y'};
        reverseString(s);
    }

    public static void reverseString(char[] c) {
        int i = 0;
        int j = c.length - 1;

        while (i < j) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }
        System.out.println(c);
    }
}
