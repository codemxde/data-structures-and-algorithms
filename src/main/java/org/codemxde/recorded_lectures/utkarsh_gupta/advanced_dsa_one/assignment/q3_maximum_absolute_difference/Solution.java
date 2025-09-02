package org.codemxde.recorded_lectures.utkarsh_gupta.advanced_dsa_one.assignment.q3_maximum_absolute_difference;

public class Solution {

    public int maxArr(int[] A) {
        int maximumX = Integer.MIN_VALUE, minimumX = Integer.MAX_VALUE;
        int maximumY = maximumX, minimumY = minimumX;

        for (int i = 0; i < A.length; i++) {
            int X = A[i] + i;
            if (X > maximumX) {
                maximumX = X;
            }
            if (X < minimumX) {
                minimumX = X;
            }

            int Y = A[i] - i;
            if (Y > maximumY) {
                maximumY = Y;
            }
            if (Y < minimumY) {
                minimumY = Y;
            }
        }

        return maximumOf( ( maximumX - minimumX ), ( maximumY - minimumY ) );
    }

    public static int maximumOf(int A, int B) {
        return A > B ? A : B;
    }
}
