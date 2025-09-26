// TODO: Test case for A = 7 is unclear

package org.codemxde.live_classes.advanced_dsa_one.lecture_04_bit_manipulation.additional_problems.q2_help_from_sam;

public class Solution {

    public static void main(String[] args) {
        System.out.printf("Minimum times help asked: %d%n", solve(7));
    }

    public static int solve(int A) {
        // Return the number of set bits
        int setbits = 0;
        while (A > 0) {
            if ((A & 1) != 0) setbits++;
            A >>= 1;
        }

        return setbits;
    }
}
