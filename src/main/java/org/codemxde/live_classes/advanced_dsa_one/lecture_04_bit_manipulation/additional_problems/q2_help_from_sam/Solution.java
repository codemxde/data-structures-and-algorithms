// TODO: Test case for A = 7 is unclear

package org.codemxde.live_classes.advanced_dsa_one.lecture_04_bit_manipulation.additional_problems.q2_help_from_sam;

public class Solution {

    public static void main(String[] args) {
        System.out.printf("Minimum times help asked: %d%n", solve(7));
    }

    public static int solve(int A) {
        if (A == 0) return 0;

        int score = 1;
        while ((score << 1) <= A) {
            score = (score << 1);
        }

        return 1 + (A - score);
    }
}
