package com.String;
//https://leetcode.com/problems/robot-return-to-origin/description/
public class RobotReturnToOrigin {
    public static void main(String[] args) {
        String moves = "RRDD";
        System.out.println(judgeCircle(moves));
    }

    public static boolean judgeCircle(String moves) {
        int up = 0, down = 0, lef = 0, rig = 0;

        for (char i : moves.toCharArray()) {
            if (i == 'U') up++;
            if (i == 'D') down++;
            if (i == 'L') lef++;
            if (i == 'R') rig++;
        }
        return (up - down) == 0 && (lef - rig) == 0;
    }
}
