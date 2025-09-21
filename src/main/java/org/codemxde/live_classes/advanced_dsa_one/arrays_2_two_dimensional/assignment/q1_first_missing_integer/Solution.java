package org.codemxde.live_classes.advanced_dsa_one.arrays_2_two_dimensional.assignment.q1_first_missing_integer;

public class Solution {

    public static int firstMissingPositive(int[] A) {
        // Approach
        // Iterate the array, if you find a number
        // greater than or less than equal to 0, no swap needed
        // Otherwise, swap the number at current index, untill above condition is met

        int N = A.length;
        for (int i = 0; i < N; i++) {
            if (A[i] == i + 1) continue;

            while (A[i] != i + 1  && A[i] > 0 && A[i] <= N && A[i] != A[A[i] - 1]) {
                int temp = A[A[i] - 1];
                A[A[i] - 1] = A[i];
                A[i] = temp;
            }
        }

        for (int i = 0; i < N; i++) {
            if (A[i] != i + 1) return i + 1;
        }

        return N + 1;
    }
}
