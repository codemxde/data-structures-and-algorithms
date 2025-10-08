package org.codemxde.live_classes.advanced_dsa_one.lecture_09_hashing.assignment.q2_count_distinct_elements;

import java.util.HashSet;

public class Solution {
    public int solve(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }

        return set.size();
    }
}
