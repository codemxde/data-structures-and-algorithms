package org.codemxde.live_classes.advanced_dsa_one.lecture_05_lab_session_on_bit_manipulation.assignment.q1_number_of_1_bits;

public class Solution {

    public static int numSetBits(int A) {
        int one_bits = 0;
        while (A > 0) {
            if ((A & 1) != 0) one_bits++;
            A >>= 1;
        }

        return one_bits;
    }
}
