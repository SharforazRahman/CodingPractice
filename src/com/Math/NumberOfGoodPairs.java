package com.Math;
//https://leetcode.com/problems/number-of-good-pairs/description/
import java.util.HashMap;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(arr));
    }
    public static int numIdenticalPairs(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr) map.put(i, map.getOrDefault(i, 0)+ 1);

        int sum = 0;
        for(int i : map.values()) sum += (i * (i - 1))/2;

        return sum;
    }
}

//Suppose there are 3 same kind of people, so those 3 people will have 6 hands, so if, with those 6 hands if handshakes
// are been made then total 3 people will be there. so the ans is 3