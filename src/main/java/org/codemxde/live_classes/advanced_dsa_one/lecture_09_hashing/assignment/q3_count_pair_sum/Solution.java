package org.codemxde.live_classes.advanced_dsa_one.lecture_09_hashing.assignment.q3_count_pair_sum;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        int answer = solve(new int[] { 16, 3, 3, 6, 7, 8, 17, 13, 7 }, 3);
        System.out.println("No of pairs: " + answer);
    }

    public static int solve(int[] A, int B) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;
        int mod = 1000000007;
        for (int i = 0; i < A.length; i++) {
            int element = A[i];
            int difference = B - element;

            if (map.containsKey(difference)) {
                int frequency = map.get(difference);
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
