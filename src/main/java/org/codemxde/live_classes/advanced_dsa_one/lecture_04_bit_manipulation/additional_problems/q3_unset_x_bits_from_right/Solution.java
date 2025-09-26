package org.codemxde.live_classes.advanced_dsa_one.lecture_04_bit_manipulation.additional_problems.q3_unset_x_bits_from_right;

public class Solution {

    public static long solve(long A, int B) {
        int i = 0;
        while (i < B) {
            // bit is set
            if ((A & (1L << i)) != 0) {
                // unset the bit
                A ^= (1L << i);
            }
            i++;
        }

        return A;
    }
}
