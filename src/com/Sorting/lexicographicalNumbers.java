package com.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lexicographicalNumbers {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(lexicalOrder(n));
    }
    public static List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        String[] str = new String[n];

        for(int i=1;i<=n;i++) str[i-1] = Integer.toString(i);
        Arrays.sort(str);
        for(String s: str) list.add(Integer.parseInt(s));
        return list;
    }
}
