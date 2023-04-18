package com.String;

//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
public class FinalValueOfVariableAfterPerfomingOperation {
    public static void main(String[] args) {
        String[] operations = {"--X", "X++", "X++"};
        System.out.println(finalValueAfterOperations(operations));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int sum = 0;
        for (String i : operations) {
            if (i.equals("--X") || i.equals("X--")) sum -= 1;
            else sum += 1;
        }
        return sum;
    }
}
