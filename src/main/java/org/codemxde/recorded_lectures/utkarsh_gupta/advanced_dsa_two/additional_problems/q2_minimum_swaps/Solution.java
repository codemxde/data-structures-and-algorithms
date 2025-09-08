package org.codemxde.recorded_lectures.utkarsh_gupta.advanced_dsa_two.additional_problems.q2_minimum_swaps;

public class Solution {

    public int solve(int[] A, int B) {
        int windowSize = 0;
        for (int ele : A) {
            if (ele <= B) windowSize++;
        }

        int badNums = 0;
        for (int i = 0; i < windowSize; i++) {
            if (A[i] > B) badNums++;
        }

        int minSwaps = badNums;

        int si = 1, ei = windowSize;
        while (ei < A.length) {
            if (A[si - 1] > B) badNums--;
            if (A[ei] > B) badNums++;

            minSwaps = Math.min(badNums, minSwaps);

            si++; ei++;
        }

        return minSwaps;
    }
}
