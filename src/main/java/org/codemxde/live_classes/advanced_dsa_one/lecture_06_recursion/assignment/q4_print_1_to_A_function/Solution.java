package org.codemxde.live_classes.advanced_dsa_one.lecture_06_recursion.assignment.q4_print_1_to_A_function;

public class Solution {

    public static void main(String[] args) {
        solve(9);
    }
    public static void solve(int A) {
        printNumbers(A);
        System.out.println();
    }

    public static void printNumbers(int A) {
        if (A == 1) {
            System.out.print(A + " ");
            return;
        }

        printNumbers(A - 1);
        System.out.print(A + " ");
    }
}
