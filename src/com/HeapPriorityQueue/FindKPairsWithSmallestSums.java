package com.HeapPriorityQueue;
//https://leetcode.com/problems/find-k-pairs-with-smallest-sums/
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class FindKPairsWithSmallestSums {
    public static void main(String[] args) {
        int[] num1 = {1, 7, 11};
        int[] num2 = {2, 4, 6};
        int k = 3;
        System.out.println(kSmallestPairs(num1, num2, k));
    }

    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int j : nums1) {
            pq.add(new Pair(j, nums2[0], j + nums2[0], 0));
        }
        while (k > 0 && pq.size() > 0) {
            Pair rem = pq.remove();
            List<Integer> list = new ArrayList<>();
            list.add(rem.a);
            list.add(rem.b);
            result.add(list);

            int index = rem.idx;
            if (index < nums2.length - 1) {
                pq.add(new Pair(rem.a, nums2[index + 1], rem.a + nums2[index + 1], index + 1));
            }

            k--;
        }
        return result;
    }

    static class Pair implements Comparable<Pair> {
        int a;
        int b;
        int sum;
        int idx;

        Pair(int a, int b, int sum, int idx) {
            this.a = a;
            this.b = b;
            this.sum = sum;
            this.idx = idx;
        }

        public int compareTo(Pair o) {
            return this.sum - o.sum;
        }
    }
}
