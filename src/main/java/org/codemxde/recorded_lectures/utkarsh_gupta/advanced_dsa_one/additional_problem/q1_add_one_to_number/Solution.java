package org.codemxde.recorded_lectures.utkarsh_gupta.advanced_dsa_one.additional_problem.q1_add_one_to_number;

public class Solution {

    public int[] plusOne(int[] A) {

        int N = A.length;

        // edge case, where all digits are 9
        if (allDigitsAreNine(A)) {
            int[] newNumber = new int[N + 1];
            newNumber[0] = 1;
            return newNumber;
        }

        // if last digit is less than 9
        if (A[N - 1] < 9) {
            A[N - 1] += 1;

            int countOfZeroes = countOfLeadingZeroes(A);
            if (countOfZeroes > 0 && countOfZeroes != A.length) return trimArray(A, countOfZeroes);

            return A;
        }

        // keep on adding from last, and forward the carry
        int index = A.length - 1, carry = 1;
        while (carry != 0) {
            int digit = A[index] + carry;

            if (digit > 9) {
                digit -= 10;
            } else {
                carry = 0;
            }
            A[index] = digit;
            index--;
        }

        // if there are any leading 0's in the array
        int leadingZeroes = countOfLeadingZeroes(A);
        if (leadingZeroes == 0) {
            return A;
        }

        return trimArray(A, leadingZeroes);
    }

    public static boolean allDigitsAreNine(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] != 9) return false;
        }
        return true;
    }

    public static int countOfLeadingZeroes(int[] A) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                count++;
            } else {
                break;
            }
        }

        return count;
    }

    public static int[] trimArray(int[] A, int countOfZeroes) {
        int[] trimmedArr = new int[A.length - countOfZeroes];
        int index = 0;

        for (int i = countOfZeroes; i < A.length; i++) {
            trimmedArr[index] = A[i];
            index++;
        }

        return trimmedArr;
    }
}
