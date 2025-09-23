package org.codemxde.live_classes.advanced_dsa_one.lecture_03_lab_session_on_arrays.assignment.q3_next_permutation;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] A = new int[] { 251, 844, 767, 778, 658, 337, 10, 252, 632, 262, 707, 506, 701, 475, 410, 696, 631, 903, 516, 149, 344, 101, 42, 891, 991 };
        int[] answer = nextPermutation(A);
        System.out.println("next permutation: " + Arrays.asList(answer));
    }

    public static int[] nextPermutation(int[] A) {
        int N = A.length;
        int index = -1;
        for (int i = N - 2; i >= 0; i--) {
            if (A[i] < A[i + 1]) {
                index = i;
                break;
            }
        }

        // no smaller permuation, reverse and return the array
        if (index == -1) {
            reverseArray(A, 0, N - 1);
            return A;
        }

        // reverse only last part of array
        // find element which is just greater than element at A[index]
        int element = A[index], greaterNumber = -1, swapIndex = -1;
        for (int i = N - 1; i > index; i--) {
            if (A[i] > element) {
                greaterNumber = A[i];
                swapIndex = i;
                break;
            }
        }

        // swap element with greaterNumber
        int temp = A[index];
        A[index] = A[swapIndex];
        A[swapIndex] = temp;

        reverseArray(A, index + 1, N - 1);

        return A;
    }

    public static void reverseArray(int[] A, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            int temp = A[startIndex];
            A[startIndex] = A[endIndex];
            A[endIndex] = temp;

            // iteration
            startIndex++; endIndex--;
        }
    }
}
