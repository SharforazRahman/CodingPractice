package com.Math;

public class AverageValueOfEvenNumberThatAreDivisibleByThree {
    public static void main(String[] args) {
        int[] arr = {1,3,6,10,12,15};
        System.out.println(averageValue(arr));
    }
    public static int averageValue(int[] arr) {
        int count = 0, sum = 0;
        for(int i : arr){
            if(i % 2 == 0 && i % 3 == 0){
                sum += i;
                count++;
            }
        }
        return count==0?0:Math.round(sum/count);
    }
}
