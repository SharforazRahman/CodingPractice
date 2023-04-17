package com.Math;
//https://leetcode.com/problems/xor-operation-in-an-array/
public class XorOperationInArray {
    public static void main(String[] args) {
        int n = 5, start = 0;
        System.out.println(xorOperation(n,start));
    }

    public static int xorOperation(int n, int start) {
        int xor = 0;
        while (n != 0){
            xor ^= start;
            start += 2;
            n--;
        }
        return xor;
    }
}