package com.String;

public class MaximumNumberOfVowelsInSubstringOfGivenLength {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxLength(s,k));
    }
    public static int maxLength(String s, int k){
        int i = 0, j = 0, count = 0, max = 0;
        char[] c = s.toCharArray();

        while (j < c.length){
            if(isVowel(c[j])) count++;
            if((j - i + 1) < k) j++;
            else if((j - i + 1) == k){
                max = Math.max(max,count);
                if(isVowel(c[i])) count--;
                i++;
            }
        }
        return max;
    }
    public static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
