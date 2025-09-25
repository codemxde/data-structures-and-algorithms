package org.codemxde.live_classes.advanced_dsa_one.lecture_04_bit_manipulation.assignment.q1_number_of_1_bits;

public class Solution {

    public static void main(String[] args) {
        System.out.printf("Number of 1 bits: %d", numSetBits(6));
    }

    public static int numSetBits(int A) {
        // Approach
        // Convert the integer into it's binary equivalent
        // Keep track of 1s
        int answer = 0;
        while (A > 0) {
            int remainder = A % 2;
            if (remainder == 1) answer++;
            A /= 2;
        }

        return answer;
    }
}
