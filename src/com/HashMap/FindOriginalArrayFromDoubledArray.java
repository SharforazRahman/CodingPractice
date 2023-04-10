package com.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FindOriginalArrayFromDoubledArray {
    public static void main(String[] args) {
        int[] changed = {1, 3, 4, 2, 6, 8};
        System.out.println(Arrays.toString(findOriginalArray(changed)));
    }

    public static int[] findOriginalArray(int[] a) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : a) map.put(i, i * 2);

        for (int i : a) {
            int doubleValue = i * 2;
            if(map.containsKey(doubleValue)){
                if(!(list.contains(i / 2 ) || list.contains(i * 2))) list.add(i);
            }
        }
        System.out.println(list);
        return a;
    }
}
