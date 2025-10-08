package org.codemxde.live_classes.advanced_dsa_one.lecture_09_hashing.additional_problems.q3_count_pair_difference;

import java.util.HashMap;

public class Solution {
    public int solve(int[] A, int B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0, mod = 1000000007;

        for (int i = 0; i < A.length; i++) {
            int element = A[i];
            int pair_element_1 = B + element;
            int pair_element_2 = element - B;

            // checking pair category 1
            if (map.containsKey(pair_element_1)) {
                int frequency = map.get(pair_element_1);
                count = (count + frequency) % mod;
            }

            // checking pair category 2
            if (map.containsKey(pair_element_2)) {
                int frequency = map.get(pair_element_2);
                count = (count + frequency) % mod;
            }

            if (map.containsKey(element)) {
                int frequency = map.get(element);
                map.put(element, ++frequency);
            } else {
                map.put(element, 1);
            }
        }

        return count;
    }
}
