package com.String;

public class StudentsAttendanceRecordOne {
    public static void main(String[] args) {
        String s = "AA";
        System.out.println(checkRecord(s));
    }

    public static boolean checkRecord(String s) {
        int A = 0, L = 0, max = 0;
        for (char c : s.toCharArray()) {
            if (c == 'A') A++;
        }
        if (A >= 2) return false;
        for (char c : s.toCharArray()) {
            if (c == 'L') {
                L++;
            } else {
                L = 0;
            }
            max = Math.max(max, L);
        }
        return max < 3;
    }
}
