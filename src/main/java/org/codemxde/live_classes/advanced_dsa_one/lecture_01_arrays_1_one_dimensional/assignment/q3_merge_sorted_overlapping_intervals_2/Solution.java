package org.codemxde.live_classes.advanced_dsa_one.lecture_01_arrays_1_one_dimensional.assignment.q3_merge_sorted_overlapping_intervals_2;

import java.util.ArrayList;

public class Solution {
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList < ArrayList <Integer> > answer = new ArrayList<>();

        int si = A.get(0).get(0), ei = A.get(0).get(1);
        for (int i = 1; i < A.size(); i++) {
            int startIndex = A.get(i).get(0), endIndex = A.get(i).get(1);
            if (startIndex <= ei) {
                ei = Math.max(endIndex, ei);
            } else {
                ArrayList<Integer> interval = new ArrayList<>();
                interval.add(si); interval.add(ei);
                answer.add(interval);

                si = startIndex; ei = endIndex;
            }
        }

        // adding the last interval
        ArrayList<Integer> interval = new ArrayList<>();
        interval.add(si); interval.add(ei);
        answer.add(interval);

        return answer;
    }
}
