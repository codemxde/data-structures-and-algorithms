package org.codemxde.live_classes.advanced_dsa_one.lecture_03_lab_session_on_arrays.assignment.q2_spiral_order_matrix_2;

public class Solution {

    public static int[][] generateMatrix(int A) {
        int[][] spiralMatrix = new int[A][A];

        int row = 0, col = 0, element = 1;
        while (A > 1) {
            // Column wise left to right traversal, row = 0, col = 0
            for (int i = 0; i < A - 1; i++) {
                spiralMatrix[row][col] = element;
                element++; col++;
            }

            // Row wise traversal top to bottom, row = 0, col = A - 1
            for (int i = 0; i < A - 1; i++) {
                spiralMatrix[row][col] = element;
                element++; row++;
            }

            // Column wise traversal right to left, row = A - 1, col = A - 1
            for (int i = 0; i < A - 1; i++) {
                spiralMatrix[row][col] = element;
                element++; col--;
            }

            // Column wise traversal bottomm to top, row = A - 1, col = 0
            for (int i = 0; i < A - 1; i++) {
                spiralMatrix[row][col] = element;
                element++; row--;
            }

            // We're done with the spiral, move to inner spiral
            row++; col++;
            A -= 2;
        }

        // for odd length square matrix, when A = 1 at the end
        if (A == 1) {
            spiralMatrix[row][col] = element;
        }

        return spiralMatrix;
    }
}
