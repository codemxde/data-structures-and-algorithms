package org.codemxde.live_classes.advanced_dsa_one.lecture_06_recursion.assignment.q3_find_fibonacci_2;

public class Solution {

    public int findAthFibonacci(int A) {
        if (A < 2) return A;
        return findAthFibonacci(A - 1) + findAthFibonacci(A - 2);
    }
}
