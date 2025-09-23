package org.codemxde.live_classes.advanced_dsa_one.lecture_01_arrays_1_one_dimensional.assignment.q2_continuous_sum_query;

public class Solution {
    public static int[] solve(int A, int[][] B) {
        int[] moneyPot = new int[A];
        for (int i = 0; i < B.length; i++) {
            int si = B[i][0] - 1, ei = B[i][1];
            int donation = B[i][2];

            moneyPot[si] += donation;
            if (ei < A) moneyPot[ei] -= donation;
        }

        // modifying moneyPot array and creating prefix-sum
        for (int i = 1; i < A; i++) {
            moneyPot[i] += moneyPot[i - 1];
        }

        return moneyPot;
    }
}
