//  THIS SOLUTION IS NOT COMPLETE / PARTIALLY WORKING

package org.codemxde.live_classes.advanced_dsa_one.arrays_1_one_dimensional.additional_problems.q2_merge_intervals_2;

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        int[][] a = new int[][] { { 1, 2 }, { 8, 10 } };
        int[] b = new int[] { 3, 6 };

        ArrayList < ArrayList <Integer> > A = new ArrayList<>();
        for (int[] arr: a) {
            ArrayList<Integer> interval = new ArrayList<>();
            interval.add(arr[0]); interval.add(arr[1]);

            A.add(interval);
        }

        ArrayList<Integer> B = new ArrayList<>();
        for (int ele: b) {
            B.add(ele);
        }

        ArrayList < ArrayList <Integer> > answer = insert(A, B);
        System.out.println(answer);
    }

    public static ArrayList<ArrayList<Integer>> insert(ArrayList<ArrayList<Integer>> A, ArrayList<Integer> B) {
        ArrayList < ArrayList <Integer> > answer = new ArrayList<>();
        int index = -1;
        int si = B.get(0), ei = B.get(1);
        for (int i = 0; i < A.size(); i++) {
            int startIndex = A.get(i).get(0);
            int endIndex = A.get(i).get(1);

            int maxStartIdx = Math.max(si, startIndex);
            int minEndIdx = Math.min(ei, endIndex);

            // non-merging interval
            if (maxStartIdx > minEndIdx) {
                answer.add(A.get(i));
            } else {
                // we have found an overlapping interval
                index = i;
                break;
            }
        }

        // there has been no overlapping interval found
        if (index == -1) {
            // either it will be present at start, at the end or
            // somewhere in the middle

            // add B at start
            if (answer.size() > 0 && answer.get(0).get(0) > ei) {
                answer.add(0, B);
                return answer;
            } else if (answer.size() > 0 && answer.get(answer.size() - 1).get(1) < si) {
                // add B at the end
                answer.add(B);
                return answer;
            } else {
                // reset index to find where to place B
                index = 0;
                answer = new ArrayList<>();
            }
        }

        // two cases remain, either an overlap index has been found
        // or, B is present somewhere between the intervals

        for (int i = index; i < A.size(); i++) {
            int startIndex = A.get(i).get(0), endIndex = A.get(i).get(1);
            if (startIndex <= ei) {
                si = Math.min(si, startIndex);
                ei = Math.max(ei, endIndex);
            } else {
                ArrayList<Integer> interval = new ArrayList<>();
                interval.add(si); interval.add(ei);
                answer.add(interval);

                si = startIndex; ei = endIndex;
            }
        }

        // adding last interval
        ArrayList<Integer> interval = new ArrayList<>();
        interval.add(si); interval.add(ei);
        answer.add(interval);

        return answer;
    }
}
