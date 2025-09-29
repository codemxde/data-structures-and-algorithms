package org.codemxde.live_classes.advanced_dsa_one.lecture_06_recursion.additional_problems.q3_decreasing_increasing_in_one_function;

public class Solution {

    public void DecThenInc(int A) {
        printDecreasing(A);
        printIncreasing(A);

        System.out.println();
    }

    public static void printDecreasing(int A) {
        if (A == 0) return;

        System.out.print(A + " ");
        printDecreasing(A - 1);

    }

    public static void printIncreasing(int A) {
        if (A == 0) return;

        printIncreasing(A - 1);
        System.out.print(A + " ");
    }
}
