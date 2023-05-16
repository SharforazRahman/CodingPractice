package com.Array;

public class MinMaxGame {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4, 8, 2, 2};
        System.out.println(minMaxGame(arr));
    }

    public static int minMaxGame(int[] a) {
        for(int n= a.length; n>1 ; n-=(n/2)){
            for(int i=0;i<n/2;i++)
                a[i]= (i%2)==1? Math.max(a[2 * i], a[2 * i + 1]) : Math.min(a[2 * i], a[2 * i + 1]);
        }
        return a[0];
    }
}
