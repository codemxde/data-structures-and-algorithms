package org.codemxde.recorded_lectures.utkarsh_gupta.advanced_dsa_one.arrays_2_two_dimensional.in_class;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // 1. Creating a 2D Prefix Sum Array
        int[][] A =  create2DPrefixSumArray();

        // 2. Finding Sum of a Submatrix
        calculateSubmatrixSum(A, new int[] { 1, 1 }, new int[] { 2, 3 });

        // 3. Sum of all Submatrices
        calculateSumOfAllSubmatrices(A);
    }

    public static void printEndOfSegment() {
        System.out.println("=====================================================");
    }

    public static int[][] create2DPrefixSumArray() {
        int [][] A = new int[][] {
                { 11, 24, 36, 45, 53 },
                { 60, 71, 82, 99, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 }
        };

        int R = A.length, C = A[0].length;
        for (int r = 0; r < R; r++) {
            int leftSum = 0, aboveSum = 0, diagonalSum = 0;
            for (int c = 0; c < C; c++) {
                if (c > 0) leftSum = A[r][c - 1];
                if (r > 0) aboveSum = A[r - 1][c];
                if (c > 0 && r > 0) diagonalSum = A[r - 1][c - 1];

                A[r][c] += leftSum + aboveSum - diagonalSum;
            }
        }

        // Printing on Console
        System.out.println("Prefix Sum 2D Array:");
        for (int[] arr: A) {
            System.out.println(Arrays.toString(arr));
        }

        printEndOfSegment();
        return A;
    }

    public static void calculateSubmatrixSum(int[][] A, int[] topRight, int[] bottomLeft) {
        // top-left indexes
        int topRow = topRight[0], topColumn = topRight[1];
        // botton-right indexes
        int bottomRow = bottomLeft[0], bottomColumn = bottomLeft[1];

        int matrixSum = A[bottomRow][bottomColumn];
        int leftMatrixSum = topColumn > 0 ? A[bottomRow][topColumn - 1] : 0;
        int aboveMatrixSum = topRow > 0 ? A[topRow - 1][bottomColumn] : 0;
        int diagonalMatrixSum = topRow > 0 && topColumn > 0 ? A[topRow - 1][topColumn - 1] : 0;

        int submatrixSum = matrixSum - leftMatrixSum - aboveMatrixSum + diagonalMatrixSum;

        System.out.println("Submatrix Sum is: " + submatrixSum);

        printEndOfSegment();
    }

    public static void calculateSumOfAllSubmatrices(int[][] A) {
        int R = A.length, C = A[0].length;
        int finalSum = 0;

        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                finalSum += A[r][c] * (r + 1) * (c + 1) * (R - 1) * (C - 1);
            }
        }

        System.out.println("Sum of all submatrices is: " + finalSum);

        printEndOfSegment();
    }

}
