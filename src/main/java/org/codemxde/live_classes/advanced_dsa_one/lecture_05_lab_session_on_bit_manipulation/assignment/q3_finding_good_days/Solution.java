package org.codemxde.live_classes.advanced_dsa_one.lecture_05_lab_session_on_bit_manipulation.assignment.q3_finding_good_days;

public class Solution {

    public int solve(int A) {
        int days = 0;
        while (A > 0) {
            if ((A & 1) != 0) days++;
            A >>= 1;
        }

        return days;
    }
}
