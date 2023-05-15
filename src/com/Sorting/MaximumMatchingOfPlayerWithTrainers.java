package com.Sorting;
//https://leetcode.com/problems/maximum-matching-of-players-with-trainers/
import java.util.Arrays;

public class MaximumMatchingOfPlayerWithTrainers {
    public static void main(String[] args) {
        int[] players = {4, 7, 9};
        int[] trainers = {8, 2, 5, 8};
        System.out.println(matchPlayersAndTrainers(players, trainers));
    }

    public static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int i = 0, j = 0, max = 0;
        while (i < players.length && j < trainers.length){
            if(players[i] > trainers[j]) j++;
            else if (players[i] <= trainers[j]) {
                max++;
                i++;
                j++;
            }
        }
        return max;
    }
}
