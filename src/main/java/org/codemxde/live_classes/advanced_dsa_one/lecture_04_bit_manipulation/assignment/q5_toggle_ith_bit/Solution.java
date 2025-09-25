package org.codemxde.live_classes.advanced_dsa_one.lecture_04_bit_manipulation.assignment.q5_toggle_ith_bit;

public class Solution {

    public int solve(int A, int B) {
        // Toggle the bit at index B
        return A ^ (1 << B);
    }
}
