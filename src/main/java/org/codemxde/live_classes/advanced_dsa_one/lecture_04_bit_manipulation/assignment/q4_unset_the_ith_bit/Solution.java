package org.codemxde.live_classes.advanced_dsa_one.lecture_04_bit_manipulation.assignment.q4_unset_the_ith_bit;

public class Solution {

    public static int solve(int A, int B) {
        // Approach
        // Check if bit at index B from last is set or unset
        // i.e. check if A & (1 << B) is 0 or not
        // If it is 0, return the number as it is, otherwise toggle bit
        // and return the toggled number
        if ((A & (1 << B)) == 0) return A;
        return A ^ (1 << B);
    }
}
