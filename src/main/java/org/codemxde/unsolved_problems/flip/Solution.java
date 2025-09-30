package org.codemxde.unsolved_problems.flip;

public class Solution {

    public static void main(String[] args) {
        int[] indexes = flip("010");
    }


    public static int[] flip(String A) {
        // Approach: Kadane's algorithm
        // carry forward max consecutive count of 0's
        // and reset when count gets below 0
        // when resetting, keep track of indexes

        // edge case: all 1's in string
        if (countOnes(A) == A.length()) return new int[] {};

        int count_of_zeroes = 0, max_count = -1;
        int si = 0, ei = 0;
        int currentStartIndex = 0;

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            if (ch == '0') {
                count_of_zeroes++;
                if (count_of_zeroes > max_count) {
                    max_count = count_of_zeroes;
                    si = currentStartIndex;
                    ei = i;
                }
            } else {
                count_of_zeroes--;
                if (count_of_zeroes < 0) {
                    count_of_zeroes = 0;
                    currentStartIndex = i + 1;
                }
            }
        }

        return new int[] { si + 1, ei + 1 };
    }

    public static int countOnes(String A) {
        int count = 0;

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            if (ch == '1') count++;
        }

        return count;
    }
}
