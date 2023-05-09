package com.Sorting;

import java.util.Arrays;

//https://leetcode.com/problems/check-if-a-string-can-break-another-string/
public class CheckIfAStringCanBreakAnotherString {
    public static void main(String[] args) {
        String s1 = "abc", s2 = "xya";
        System.out.println(checkIfCanBreak(s1, s2));
    }

    public static boolean checkIfCanBreak(String s1, String s2) {
        char[] c = s1.toCharArray();
        char[] ch = s2.toCharArray();

        Arrays.sort(c);
        Arrays.sort(ch);

        boolean inc = false, dec = false;
        for (int i = 0; i < c.length; i++) {
            if (c[i] < ch[i]) inc = true;
            if (ch[i] < c[i]) dec = true;
        }
        return inc || dec;
    }
}
