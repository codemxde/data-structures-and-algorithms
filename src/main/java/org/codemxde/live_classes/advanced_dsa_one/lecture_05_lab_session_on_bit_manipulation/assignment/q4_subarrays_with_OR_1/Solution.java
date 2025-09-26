package org.codemxde.live_classes.advanced_dsa_one.lecture_05_lab_session_on_bit_manipulation.assignment.q4_subarrays_with_OR_1;

public class Solution {

    public static void main(String[] args) {
        System.out.println("Subarrays with 1: " + subarraysWithOR1(new int[] { 0, 0, 1, 1, 0 }));
    }
    public static int subarraysWithOR1(int[] A) {
        int N = A.length;
        int count = 0, subarrays = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == 0) {
                count++;
            } else {
                subarrays += (count * (count + 1)) / 2;
                count = 0;
            }
        }

        // Add the final subarrays with carry forwarded coount
        subarrays += count * (count + 1) / 2;

        int totalSubarrays = (N * (N + 1)) / 2;
        return totalSubarrays - subarrays;
    }
}
