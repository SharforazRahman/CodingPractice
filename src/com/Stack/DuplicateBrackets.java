package com.Stack;

import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args) {
        String str = "(a+b)+()+((c+d))";
        System.out.println(duplicate(str));
    }
    public static boolean duplicate(String str){
        Stack<Character> stack = new Stack<>();

        for(char i : str.toCharArray()){
            if(i == ')'){
                if(stack.peek() == '(') return true;
                else {
                    while (stack.peek() != '(') stack.pop();
                }
                stack.pop();
            }
            else stack.push(i);
        }
        return false;
    }
}
