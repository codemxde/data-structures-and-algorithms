package org.codemxde.live_classes.advanced_dsa_one.lecture_02_arrays_2_two_dimensional.assignment.q3_search_in_sorted_matrix;

public class Solution {

    public static void main(String[] args) {
        int[][] A = new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int B = 2;

        int answer = solve(A, B);
        System.out.printf("Answer: %d", answer);
    }

    public static int solve(int[][] A, int B) {
        int N = A.length;
        int i = 0, j = A[0].length - 1;
        int answer = Integer.MAX_VALUE;

        while (i < N && j >= 0) {
            int ele = A[i][j];
            if (B == ele) {
                int value = ((i + 1) * 1009) + (j + 1);
                answer = Math.min(answer, value);
                j--;
            } else if (B > ele) {
                i++;
            } else {
                j--;
            }
        }

        return answer == Integer.MAX_VALUE ? -1 : answer;
    }
}
