package com.Stack;
//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
import java.util.Stack;

public class RemoveAllDuplicateAdjacentString {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));

    }

    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for(char i : s.toCharArray()){
            if(stack.size() > 0 && i == stack.peek()){
                stack.pop();
            }else {
                stack.push(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : stack){
            sb.append(ch);
        }
        return sb.toString();
    }
}
