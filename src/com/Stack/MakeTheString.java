package com.Stack;

import java.util.Stack;
//https://leetcode.com/problems/make-the-string-great/
public class MakeTheString {
    public static void main(String[] args) {
        String a = "leEeetcode";
        System.out.println(makeGood(a));
    }

    public static String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for(char i : s.toCharArray()){
            if(!stack.isEmpty() && Math.abs(i - stack.peek()) == 32){
                stack.pop();
            }else {
                stack.push(i);
            }
        }
        System.out.println(stack);
        return "";
    }
}
