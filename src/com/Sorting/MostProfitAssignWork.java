package com.Sorting;

import java.util.Arrays;
import java.util.HashMap;

public class MostProfitAssignWork {
    public static void main(String[] args) {
        int[] difficulty = {2, 4, 6, 8, 10};
        int[] profit = {10, 20, 30, 40, 50};
        int[] worker = {4, 5, 6, 7};
        System.out.println(maxProfitAssignment(difficulty, profit, worker));
    }

    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(difficulty);
        Arrays.sort(profit);
        Arrays.sort(worker);

        for(int i = 0; i < profit.length; i++){
            map.put(difficulty[i],profit[i]);
        }
        return 0;
    }
}
