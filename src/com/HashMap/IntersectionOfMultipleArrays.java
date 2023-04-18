package com.HashMap;
//https://leetcode.com/problems/intersection-of-multiple-arrays/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//https://leetcode.com/problems/intersection-of-multiple-arrays/
public class IntersectionOfMultipleArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 1, 2, 4, 5},
                {1, 2, 3, 4},
                {3, 4, 5, 6}
        };
        System.out.println(intersection(arr));
    }

    public static List<Integer> intersection(int[][] arr) {
        int[] a = Stream.of(arr).flatMapToInt(IntStream::of).toArray();
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : a) map.put(i, map.getOrDefault(i, 0) + 1);

        for (int i : map.keySet()) {
            if (map.get(i) == arr.length) list.add(i);
        }
        Collections.sort(list);
        return list;
    }
}
