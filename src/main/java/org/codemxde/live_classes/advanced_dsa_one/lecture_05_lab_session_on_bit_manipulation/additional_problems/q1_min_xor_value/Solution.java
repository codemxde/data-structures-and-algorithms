package org.codemxde.live_classes.advanced_dsa_one.lecture_05_lab_session_on_bit_manipulation.additional_problems.q1_min_xor_value;

import java.util.Arrays;

public class Solution {

    public static int findMinXor(int[] A) {
        // Observation:
        // Will the XOR of two numbers be minimum if they
        // mostly have same bits at the indexes ? (Idts)
        // Hints suggested to sort the array
        // Im just trying my luck here
        int N = A.length;
        Arrays.sort(A);
        int min_xor = A[0] ^ A[1];
        for (int i = 1; i < N - 1; i++) {
            int xor = A[i] ^ A[i + 1];
            min_xor = Math.min(min_xor, xor);
        }

        return min_xor;
    }
}
