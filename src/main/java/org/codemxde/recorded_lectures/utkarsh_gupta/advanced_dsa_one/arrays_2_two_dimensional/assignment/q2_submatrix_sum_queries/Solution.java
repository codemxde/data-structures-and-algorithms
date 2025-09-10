package org.codemxde.recorded_lectures.utkarsh_gupta.advanced_dsa_one.arrays_2_two_dimensional.assignment.q2_submatrix_sum_queries;

import java.util.Arrays;

public class Solution {

    // TODO: Integer Overflow has to be fixed

    public static void main(String[] args) {
        // matrix
        int[][] A = new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // queries
        int[] B = new int[] { 1, 2 };
        int[] C = new int[] { 1, 2 };
        int[] D = new int[] { 2, 3 };
        int[] E = new int[] { 2, 3 };
        System.out.println("Sum Queries Array: " + Arrays.toString(solve(A, B, C, D, E)));
    }

    public static int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
        createPrefixSumMatrix(A);
        int Q = B.length;

        int[] sumArray = new int[Q]; int index = 0;
        for (int i = 0; i < Q; i++) {
            // top-left corner
            int topLeftRowIdx = B[i] - 1;
            int topLeftColIdx = C[i] - 1;
            // bottom-right corner
            int bottomRightRowIdx = D[i] - 1;
            int bottomRightColIdx = E[i] - 1;

            // calculating sub-matrix sum
            int submatrixSum = calculateSubmatrixSum(A, topLeftRowIdx, topLeftColIdx, bottomRightRowIdx, bottomRightColIdx);
            sumArray[index] = submatrixSum;

            index++;
        }
        return sumArray;
    }

    public static void createPrefixSumMatrix(int[][] A) {
        // modifying original array for creating prefix sum
        int N = A.length, M = A[0].length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int cellValue = A[i][j];
                int leftSum = j > 0 ? A[i][j - 1] : 0;
                int aboveSum = i > 0 ? A[i - 1][j] : 0;
                int diagonalSum = i > 0 && j > 0 ? A[i - 1][j - 1] : 0;

                A[i][j] = leftSum + aboveSum - diagonalSum + cellValue;
            }
        }
    }

    public static int calculateSubmatrixSum(int[][] A, int topLeftRowIdx, int topLeftColIdx, int bottomRightRowIdx, int bottomRightColIdx) {
        if (topLeftRowIdx == 0 && topLeftColIdx == 0) {
            return A[bottomRightRowIdx][bottomRightColIdx];
        }

        int prefixMatrixSum = A[bottomRightRowIdx][bottomRightColIdx];

        int leftMatrixSum = 0;
        if (topLeftColIdx > 0) {
            leftMatrixSum = A[bottomRightRowIdx][topLeftColIdx - 1];
        }

        int topMatrixSum = 0;
        if (topLeftRowIdx > 0) {
            topMatrixSum = A[topLeftRowIdx - 1][bottomRightColIdx];
        }

        int commonMatrixSum = 0;
        if (topLeftColIdx > 0 && topLeftRowIdx > 0) {
            commonMatrixSum = A[topLeftRowIdx - 1][topLeftColIdx - 1];
        }

        return prefixMatrixSum - leftMatrixSum - topMatrixSum + commonMatrixSum;
    }
}
