package org.codemxde.recorded_lectures.utkarsh_gupta.advanced_dsa_one.assignment.q2_continuous_sum_query;

public class Solution {

    public int[] solve(int A, int[][] B) {
        int[] moneyInPot = new int[A];

        for (int i = 0; i < B.length; i++) {
            int startIndex = B[i][0] - 1, endIndex = B[i][1];
            int donation = B[i][2];

            moneyInPot[startIndex] += donation;
            if (endIndex < A) moneyInPot[endIndex] -= donation;
        }

        // creating prefix sum
        for (int i = 1; i < A; i++) {
            moneyInPot[i] += moneyInPot[i - 1];
        }

        return moneyInPot;
    }
}
