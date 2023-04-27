package com.Array;
//https://leetcode.com/problems/find-the-array-concatenation-value/
public class FindTheConcatenationValue {
    public static void main(String[] args) {
        int[] arr = {5,14,13,8,12};
        System.out.println(findTheArrayConcVal(arr));
    }

    public static long findTheArrayConcVal(int[] a) {
        StringBuilder sb = new StringBuilder();

        if(a.length % 2 != 0) sb.append(a[a.length / 2]).append(" ");
        for (int i = 0, j = a.length - 1; i < a.length / 2; i++, j--) {
            sb.append(a[i]).append(a[j]).append(" ");
        }

        long answer = 0;
        for(String k : sb.toString().split(" ")) answer += Integer.parseInt(k);
        return answer;
    }
}
