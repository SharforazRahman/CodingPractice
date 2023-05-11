package com.Array;
//https://leetcode.com/problems/pascals-triangle-ii/
import java.util.ArrayList;
import java.util.List;

public class PascalTriangleTwo {
    public static void main(String[] args) {
        int rowIndex = 3;
        System.out.println(getRow(rowIndex));
    }
    public static List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> list = new ArrayList<>();
        int ans = 1;

        for(int i = 0; i <= rowIndex; i++){
            list.add(ans);
            ans = (ans * (rowIndex - i)) / (i + 1);
        }
        return list;
    }
}
