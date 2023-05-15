package com.Math;
//https://leetcode.com/problems/the-kth-factor-of-n/description/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TheKthFactorOfN {
    public static void main(String[] args) {
        int n = 12, k = 3;
        System.out.println(KthFactor(n,k));
    }
    public static int KthFactor(int n, int k){
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0) {
                list.add(i);
                if(i != n / i) list.add(n / i);
            }
        }
        Collections.sort(list);
        if(k > list.size()) return -1;
        return list.get(k - 1);
    }
}
