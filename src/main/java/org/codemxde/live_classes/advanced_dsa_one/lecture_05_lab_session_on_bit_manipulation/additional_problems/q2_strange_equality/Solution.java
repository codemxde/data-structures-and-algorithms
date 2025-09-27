package org.codemxde.live_classes.advanced_dsa_one.lecture_05_lab_session_on_bit_manipulation.additional_problems.q2_strange_equality;

public class Solution {

    public static void main(String[] args) {
        System.out.printf("Answer: %d%n", solve(2));
    }

    public static int solve(int A) {
        // Approach:
        // X: Toggle all bits of A
        // Y: 1 << A.length | A
        int num = A, i = 0, X = 0;
        while (num > 0) {
            if ((num & 1) == 0) X += (1 << i);
            i++;
            num >>= 1;
        }


        // finding binary length of A
        num = A;
        int bitLength = 0;
        while (num > 0) {
            bitLength++;
            num >>= 1;
        }

        int Y = (1 << bitLength);

        return X ^ Y;
    }
}
