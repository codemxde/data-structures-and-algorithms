package org.codemxde.recorded_lectures.utkarsh_gupta.advanced_dsa_two.assignment.q4_maximum_submatrix_sum;

public class Solution {

    public long solve(int[][] A) {
        // creating new prefix-sum array for storing sum
        long[][] pSum =  createPrefixSumMatrix(A);

        // Approach
        // Since the matrix is sorted column-wise and row-wise
        // the bottom right element will always be the maximum
        // That means while finding the submatrix sum with highest sum,
        // the bottom-right corner of that submatrix should be the
        // bottom-right corner of the original matrix itself

        // Now, we have to check each bottom left corner, and calculate the sum
        // Carry forward the maximum and return the sum
        int N = A.length, M = A[0].length;
        int bottomRightRowIdx = N - 1, bottomRightColIdx = M - 1;

        long prefixMatrixSum = pSum[N - 1][M - 1];
        long maxSubmatrixSum = prefixMatrixSum;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

                long leftMatrixSum = 0;
                if (j > 0) {
                    leftMatrixSum = pSum[bottomRightRowIdx][j - 1];
                }

                long topMatrixSum = 0;
                if (i > 0) {
                    topMatrixSum = pSum[i - 1][bottomRightColIdx];
                }

                long commonMatrixSum = 0;
                if (i > 0 && j > 0) {
                    commonMatrixSum = pSum[i - 1][j - 1];
                }

                long submatrixSum = prefixMatrixSum - leftMatrixSum - topMatrixSum + commonMatrixSum;

                maxSubmatrixSum = Math.max(submatrixSum, maxSubmatrixSum);
            }
        }

        return maxSubmatrixSum;
    }

    public static long[][] createPrefixSumMatrix(int[][] A) {
        int N = A.length, M = A[0].length;
        long[][] pSum = new long[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                long element = A[i][j];
                long leftSum = j > 0 ? pSum[i][j - 1] : 0;
                long aboveSum = i > 0 ? pSum[i - 1][j] : 0;
                long diagonalSum = i > 0 && j > 0 ? pSum[i - 1][j - 1] : 0;

                pSum[i][j] = element + leftSum + aboveSum - diagonalSum;
            }
        }

        return pSum;
    }
}
