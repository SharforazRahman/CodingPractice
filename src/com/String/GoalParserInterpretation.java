package com.String;
//https://leetcode.com/problems/goal-parser-interpretation/
public class GoalParserInterpretation {
    public static void main(String[] args) {
        String command = "G()(al)";
        System.out.println(interpret(command));
    }

    public static String interpret(String command) {
        command = command.replace("()","o").replace("(al)","al");
        return command;
    }
}