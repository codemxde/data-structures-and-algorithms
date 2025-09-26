package org.codemxde.live_classes.advanced_dsa_one.lecture_04_bit_manipulation.additional_problems.q1_find_nth_magic_number;

public class Solution {

    public static int solve(int A) {
        int magicNumber = 0, index = 1;
        while (A > 0) {
            if ((A & 1) != 0) {
                magicNumber += Math.pow(5, index);
            }

            A >>= 1;
            index++;
        }

        return magicNumber;
    }
}
