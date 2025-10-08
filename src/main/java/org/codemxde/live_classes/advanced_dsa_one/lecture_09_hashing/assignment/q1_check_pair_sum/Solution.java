package org.codemxde.live_classes.advanced_dsa_one.lecture_09_hashing.assignment.q1_check_pair_sum;

import java.util.HashSet;

public class Solution {
    public int solve(int A, int[] B) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < B.length; i++) {
            int difference = A - B[i];
            if (set.contains(difference)) {
                return 1;
            } else {
                set.add(B[i]);
            }
        }

        return 0;
    }
}
