package com.Stack;

import java.util.Stack;

//https://leetcode.com/problems/backspace-string-compare/description/
public class BackspaceStringCompare {
    public static void main(String[] args) {
        String s = "y#fo##f", t = "y#f#o##f";
        System.out.println(backspaceCompare(s, t));
    }

    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (!stack.isEmpty())
                    stack.pop();
            } else
                stack.push(c);
        }

        for (char c : t.toCharArray()) {
            if (c == '#') {
                if (!stack2.isEmpty())
                    stack2.pop();
            } else
                stack2.push(c);

        }

        return stack.equals(stack2);
    }
}
