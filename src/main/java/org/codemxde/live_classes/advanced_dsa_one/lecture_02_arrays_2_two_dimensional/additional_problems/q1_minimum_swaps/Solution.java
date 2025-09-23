package org.codemxde.live_classes.advanced_dsa_one.lecture_02_arrays_2_two_dimensional.additional_problems.q1_minimum_swaps;

public class Solution {

    public static int solve(int[] A, int B) {
        int N = A.length, windowSize = 0;
        for (int ele: A) {
            if (ele <= B) windowSize++;
        }

        // calculating no of bad nums in the first window
        int badNums = 0;
        for (int i = 0; i < windowSize; i++) {
            if (A[i] > B) badNums++;
        }

        int si = 1, ei = windowSize;
        int swaps = badNums;
        while (ei < N) {
            if (A[si - 1] > B) badNums--;
            if (A[ei] > B) badNums++;

            swaps = Math.min(badNums, swaps);
            si++; ei++;
        }

        return swaps;
    }
}
