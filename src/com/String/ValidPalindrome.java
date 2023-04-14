package com.String;
//https://leetcode.com/problems/valid-palindrome/description/
public class ValidPalindrome {
    public static void main(String[] args) {
        String s = " ";
        //System.out.println(isPalindrome(s));
        System.out.println(palindrome(s));
    }


    /*
    Use Built-In Method;
     */
    public static boolean isPalindrome(String s) {
         s = s.replaceAll("\\W+","").replaceAll("_","").trim().toLowerCase();
         int i = 0,j = s.length() - 1;
         while (i < j){
             if(s.charAt(i) != s.charAt(j)) return false;
             i++;
             j--;
         }
        return true;
    }

    public static boolean palindrome(String s){
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;

        while (i < j){
            while (!Character.isLetterOrDigit(s.charAt(i))) i++;
            while (!Character.isLetterOrDigit(s.charAt(j))) j--;

            if(s.charAt(i) != s.charAt(j)) return false;

            i++;
            j--;
        }
        return true;
    }
}
