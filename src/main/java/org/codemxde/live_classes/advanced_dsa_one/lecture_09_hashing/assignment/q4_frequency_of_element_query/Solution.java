package org.codemxde.live_classes.advanced_dsa_one.lecture_09_hashing.assignment.q4_frequency_of_element_query;

import java.util.HashMap;

public class Solution {
    public int[] solve(int[] A, int[] B) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            int element = A[i];

            if (map.containsKey(element)) {
                int frequency = map.get(element);
                map.put(element, ++frequency);
            } else {
                map.put(element, 1);
            }
        }

        for (int i = 0; i < B.length; i++) {
            int element = B[i];
            if (map.containsKey(element)) {
                B[i] = map.get(element);
            } else {
                B[i] = 0;
            }
        }

        return B;
    }
}
