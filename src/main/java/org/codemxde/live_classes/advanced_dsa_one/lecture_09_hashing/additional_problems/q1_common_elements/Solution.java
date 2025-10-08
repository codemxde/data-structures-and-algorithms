package org.codemxde.live_classes.advanced_dsa_one.lecture_09_hashing.additional_problems.q1_common_elements;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> common_elements = new ArrayList<>();

        for (int i = 0; i < A.size(); i++) {
            int element = A.get(i);

            if (map.containsKey(element)) {
                int frequency = map.get(element);
                map.put(element, ++frequency);
            } else {
                map.put(element, 1);
            }
        }

        for (int i = 0; i < B.size(); i++) {
            int element = B.get(i);

            if (map.containsKey(element)) {
                common_elements.add(element);

                // reduce frequency
                int frequency = map.get(element);
                if (frequency > 1) {
                    map.put(element, --frequency);
                } else {
                    map.remove(element);
                }
            }
        }

        return common_elements;
    }
}
