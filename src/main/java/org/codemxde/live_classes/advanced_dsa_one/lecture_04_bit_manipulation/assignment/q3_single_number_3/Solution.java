package org.codemxde.live_classes.advanced_dsa_one.lecture_04_bit_manipulation.assignment.q3_single_number_3;

public class Solution {

    public static void main(String[] args) {
        int[] answer = solve(new int[] { 186, 256, 102, 377, 186, 377 });
        System.out.printf("Numbers are: %d and %d", answer[0], answer[1]);
    }

    public static int[] solve(int[] A) {
        int array_xor = 0, N = A.length;
        for (int ele: A) {
            array_xor ^= ele;
        }

        int index = 0;
        while (array_xor > 0) {
            int remainder = array_xor % 2;
            if (remainder == 1) break;

            array_xor /= 2;
            index++;
        }

        // At index 'index', of binary version of integer, we have a different bit
        int xor_0 = 0, xor_1 = 0;
        for (int i = 0; i < N; i++) {
            // bit is unset or 0
            if ((A[i] & (1 << index)) == 0) {
                xor_0 ^= A[i];
            } else {
                // bit is set or 1
                xor_1 ^= A[i];
            }
        }

        return xor_0 < xor_1 ? new int[] { xor_0, xor_1 } : new int[] { xor_1, xor_0 };
    }
}
