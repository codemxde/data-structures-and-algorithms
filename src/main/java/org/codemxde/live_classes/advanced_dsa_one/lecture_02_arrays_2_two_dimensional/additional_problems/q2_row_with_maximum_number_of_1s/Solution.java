package org.codemxde.live_classes.advanced_dsa_one.lecture_02_arrays_2_two_dimensional.additional_problems.q2_row_with_maximum_number_of_1s;

public class Solution {

    public static int solve(int[][] A) {
        int N = A.length, M = A[0].length;
        int i = 0, j = M - 1, rowIdx = -1, count = 0;
        while (i < N && j >= 0) {
            int element = A[i][j];
            if (element == 1) {
                count++; j--;
                rowIdx = i;
            } else {
                i++;
            }
        }

        return rowIdx;
    }
}
