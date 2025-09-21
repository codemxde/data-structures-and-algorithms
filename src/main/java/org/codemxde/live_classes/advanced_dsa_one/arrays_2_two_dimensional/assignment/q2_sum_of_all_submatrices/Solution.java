package org.codemxde.live_classes.advanced_dsa_one.arrays_2_two_dimensional.assignment.q2_sum_of_all_submatrices;

public class Solution {

    public static int solve(int[][] A) {
        int N = A.length;

        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sum += A[i][j] * ((i + 1) * (j + 1)) * (N - i) * (N - j);
            }
        }

        return sum;
    }
}
