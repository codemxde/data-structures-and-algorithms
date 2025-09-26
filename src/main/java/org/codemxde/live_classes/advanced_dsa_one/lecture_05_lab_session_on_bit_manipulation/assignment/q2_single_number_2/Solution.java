package org.codemxde.live_classes.advanced_dsa_one.lecture_05_lab_session_on_bit_manipulation.assignment.q2_single_number_2;

public class Solution {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {
        int answer = 0;
        for (int i = 0; i < 32; i++) {
            int setBits = 0;
            for (int j = 0; j < A.length; j++) {
                if ((A[j] & (1 << i)) != 0) setBits++;
            }

            if (setBits % 3 == 1) {
                answer += (1 << i);
            }
        }

        return answer;
    }
}
