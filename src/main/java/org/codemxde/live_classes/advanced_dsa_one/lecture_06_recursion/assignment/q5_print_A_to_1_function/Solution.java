package org.codemxde.live_classes.advanced_dsa_one.lecture_06_recursion.assignment.q5_print_A_to_1_function;

public class Solution {

    public void solve(int A) {
        printNumbers(A);
        System.out.println();
    }

    public static void printNumbers(int A) {
        if (A == 0) return;

        System.out.print(A + " ");
        printNumbers(A - 1);
    }
}
