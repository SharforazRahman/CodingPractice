package com.Stack;

import java.util.Stack;

//https://leetcode.com/problems/removing-stars-from-a-string/
public class RemovingStarsFromString {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }

    public static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();

        for (char i : s.toCharArray()) {
            if (stack.size() > 0 && i == '*') {
                stack.pop();
            } else {
                stack.push(i);
            }
        }
        StringBuilder ans = new StringBuilder();
        for (Character item : stack) {
            ans.append(item);
        }
        return ans.toString();
    }
}
