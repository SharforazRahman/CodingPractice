package com.HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class RankTransformOfArray {
    public static void main(String[] args) {
        int[] arr = {40,10,20,30};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
    public static int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] nArray = Arrays.copyOf(arr,arr.length);

        Arrays.sort(nArray);
        for(int i = 0; i < arr.length; i++){
            map.put(nArray[i],i + 1);
        }

        for(int i = 0; i < arr.length; i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}
