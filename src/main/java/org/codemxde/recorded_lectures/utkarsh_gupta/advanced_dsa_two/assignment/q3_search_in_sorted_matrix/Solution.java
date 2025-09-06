package org.codemxde.recorded_lectures.utkarsh_gupta.advanced_dsa_two.assignment.q3_search_in_sorted_matrix;

public class Solution {

    public static void main(String[] args) {
        int[][] A = new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("Value: " + solve(A, 2));
    }

    public static int solve(int[][] A, int B) {
        int N = A.length, M = A[0].length;
        int i = 0, j = M - 1;
        int minimumValue = Integer.MAX_VALUE;

        boolean isIntegerFound = false;

        while (i < N && j >= 0) {
            if (A[i][j] == B) {
                int calculation = (i + 1) * 1009 + (j + 1);
                minimumValue = calculation < minimumValue ? calculation : minimumValue;

                // For minimum calculation, only left search would be necessary
                // Look at the equation (i * 10009 + j)
                // Increasing 'i' i.e. going down the row would increase the minimum value
                // even if the integer is present there
                // decreasing 'j' or searching in the left columns is the only way to
                // minimise the calculation
                j--;

                isIntegerFound = true;
                continue;
            }

            if (B > A[i][j]) {
                i++;
            } else {
                j--;
            }
        }

        return isIntegerFound ? minimumValue : -1;
    }
}
