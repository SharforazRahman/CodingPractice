package com.Stack;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String str = "([(a+b)+{(c+d)*(e/f)}]";
        System.out.println(balancedBracket(str));
    }

    public static boolean balancedBracket(String str) {
        Stack<Character> stack = new Stack<>();

        for (char i : str.toCharArray()) {
            if (i == '(' || i == '{' || i == '[') stack.push(i);

            else if(i == ')'){
                if (stack.peek() == '(') stack.pop();
                else if(stack.size() == 0 || stack.peek() != '(') return false;
            }

            else if(i == '}'){
                if (stack.peek() == '{') stack.pop();
                else if(stack.size() == 0 || stack.peek() != '{') return false;
            }

            else if(i == ']'){
                if (stack.peek() == '[') stack.pop();
                else if(stack.size() == 0 || stack.peek() != '[') return false;
            }
        }
        return stack.size() == 0;
    }
}
