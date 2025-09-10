package org.codemxde.recorded_lectures.utkarsh_gupta.advanced_dsa_one.arrays_1_one_dimensional.assignment.q1_max_sum_contiguous_subarray;

public class Solution {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            sum += A[i];

            if (sum > maxSum) maxSum = sum;
            if (sum < 0) sum = 0;
        }

        return maxSum;
    }
}
