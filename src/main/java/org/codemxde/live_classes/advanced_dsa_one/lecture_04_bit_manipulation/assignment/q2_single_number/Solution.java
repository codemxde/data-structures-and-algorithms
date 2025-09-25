package org.codemxde.live_classes.advanced_dsa_one.lecture_04_bit_manipulation.assignment.q2_single_number;

public class Solution {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {
        int answer = 0;
        for (int element: A) {
            answer ^= element;
        }

        return answer;
    }
}
