package com.TwoPointer;

import java.util.Arrays;

public class MaximumMatchingOfPlayerWithTrainers {
    public static void main(String[] args) {
        int[] players = {4,7,9};
        int[] trainers = {8,2,5,8};
        System.out.println(matchPlayersAndTrainers(players, trainers));
    }

    public static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i = 0, j = 0, count = 0;
        while (j < trainers.length && i < players.length) {
            if (players[i] <= trainers[j]) {
                i++;
                j++;
                count++;
            }
            j++;
        }
        return count;
    }
}
