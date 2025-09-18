package org.codemxde.live_classes.advanced_dsa_one.arrays_1_one_dimensional.additional_problems.q1_flip;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] answer = flip("010");
        System.out.println(Arrays.toString(answer));
    }

    public static int[] flip(String A) {
        int si = 0, ei = 0, finalSi = -1;
        int count = 0, maxCount = 0;

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            if (ch == '0') {
                count++;
            } else {
                count--;
            }

            if (count > maxCount) {
                maxCount = count;
                finalSi = si;
                ei = i;
            }
            if (count < 0) {
                count = 0;
                si = i + 1;
            }
        }

        return finalSi != -1 ? new int[] { finalSi + 1, ei + 1 } : new int[] {};
    }
}
