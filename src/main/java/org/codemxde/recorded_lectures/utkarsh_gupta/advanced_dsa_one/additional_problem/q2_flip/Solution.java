package org.codemxde.recorded_lectures.utkarsh_gupta.advanced_dsa_one.additional_problem.q2_flip;

public class Solution {

    public int[] flip(String A) {
        int maxCount = -1, count = 0;
        int startIndex = 0, endIndex = 0;
        int currentStartIndex = 0;

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);

            if (ch == '0') {
                count++;
            } else if (ch == '1') {
                count--;
            }

            if (count > maxCount) {
                maxCount = count;
                endIndex = i + 1;
                startIndex = currentStartIndex + 1;
            }

            if (count < 0) {
                count = 0;
                currentStartIndex = i + 1;
            }
        }

        if (startIndex != 0 && endIndex != 0) {
            return new int[]{startIndex, endIndex};
        }

        return new int[]{};
    }
}
