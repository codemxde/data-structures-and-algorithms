package org.codemxde.recorded_lectures.utkarsh_gupta.advanced_dsa_two.assignment.q1_sum_of_all_submatrices;

public class Solution {

    public int solve(int[][] A) {
        // Contribution Technique
        // Finding out how many times a cell occurs in all the possible submatrices
        int N = A.length, M = A[0].length;
        int allSubmatricesSum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int contributionOfCell = (i + 1) * (j + 1) * (N - i) * (M - j) * A[i][j];
                allSubmatricesSum += contributionOfCell;
            }
        }

        return allSubmatricesSum;
    }
}
