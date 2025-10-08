package org.codemxde.live_classes.advanced_dsa_one.lecture_09_hashing.additional_problems.q2_count_unique_elements;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solve(int[] A) {
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

        // iterating the hashmap
        int count = 0;
        for (Map.Entry <Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() == 1) count++;
        }

        return count;
    }
}
