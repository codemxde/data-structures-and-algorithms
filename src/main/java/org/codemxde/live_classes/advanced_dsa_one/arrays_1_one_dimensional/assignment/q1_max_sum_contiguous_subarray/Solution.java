package org.codemxde.live_classes.advanced_dsa_one.arrays_1_one_dimensional.assignment.q1_max_sum_contiguous_subarray;

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int maxSubArray(final int[] A) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (sum > maxSum) maxSum = sum;
            if (sum < 0) sum = 0;
        }
        return maxSum;
    }
}
