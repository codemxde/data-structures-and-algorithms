package org.codemxde.live_classes.advanced_dsa_one.lecture_03_lab_session_on_arrays.assignment.q1_rain_water_trapped;

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int trap(final int[] A) {
        // Two pointer approach
        int N = A.length;

        // edge case: water can only be collected when there are at least 3 buildings
        if (N == 1 || N == 2) return 0;

        int si = 0, ei = N - 1;
        int lmax = A[si], rmax = A[ei];

        int water = 0;
        while (si < ei) {
            if (rmax < lmax) {
                water += rmax - A[ei];
                ei--;
                rmax = Math.max(rmax, A[ei]);
            } else {
                water += lmax - A[si];
                si++;
                lmax = Math.max(lmax, A[si]);
            }
        }

        return water;
    }
}
