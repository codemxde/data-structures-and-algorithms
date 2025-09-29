package org.codemxde.live_classes.advanced_dsa_one.lecture_06_recursion.assignment.q2_find_factorial;

public class Solution {

    public int solve(int A) {
        if (A == 0) return 1;

        return A * solve(A - 1);
    }
}
