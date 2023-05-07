package com.String;

public class FindTheLongestBalancedSubstringOfABinaryString {
    public static void main(String[] args) {
        String s = "111000";
        System.out.println(findTheLongestBalancedSubstring(s));
    }

    public static int findTheLongestBalancedSubstring(String s) {
        int ans = 0;
        for(int i = 0; i < s.length();){
            int zero = 0, one = 0;

            while(i < s.length() && s.charAt(i) == '0') {
                i++;
                zero++;
            }
            while(i < s.length() && s.charAt(i) == '1') {
                i++;
                one++;
            }

            int len = Math.min(zero,one);
            ans = Math.max(ans,len * 2);
        }
        return ans;
    }
}
