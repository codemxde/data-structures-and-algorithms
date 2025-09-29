package org.codemxde.live_classes.advanced_dsa_one.lecture_06_recursion.additional_problems.q2_sum_of_digits;

public class Solution {

    public int solve(int A) {
        if (A == 0) return 0;

        return (A % 10) + solve(A / 10);
    }
}
