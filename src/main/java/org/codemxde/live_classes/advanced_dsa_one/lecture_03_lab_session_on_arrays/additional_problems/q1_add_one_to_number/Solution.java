package org.codemxde.live_classes.advanced_dsa_one.lecture_03_lab_session_on_arrays.additional_problems.q1_add_one_to_number;

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        int[] array = new int[] { 3, 0, 6, 4, 1 };
        ArrayList<Integer> A = new ArrayList<>();
        for (int ele: array)
            A.add(ele);

        ArrayList<Integer> answer = plusOne(A);
        System.out.println("Incremented: " + answer);
    }

    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        ArrayList<Integer> answer = new ArrayList<>();

        // edge case
        if (A.size() == 1 && A.get(0) == 0) {
            answer.add(1);
            return answer;
        }

        int leadingZeroes = 0;
        for (int ele: A) {
            if (ele == 0) {
                leadingZeroes++;
            } else {
                break;
            }
        }
        for (int i = leadingZeroes; i < A.size(); i++) {
            answer.add(A.get(i));
        }

        int N = answer.size();
        // case 1: last digit is not 9
        int ele = answer.get(N - 1);
        if (ele != 9) {
            answer.set(N - 1, ++ele);
            return answer;
        }

        // case 2: all digits are 9
        int count = 0;
        for (int element: answer) {
            if (element == 9) count++;
        }

        if (count == N) {
            ArrayList<Integer> newNumber = new ArrayList<>();
            newNumber.add(1);
            for (int i = 0; i < N; i++) {
                newNumber.add(0);
            }

            return newNumber;
        }

        // case 3: some trailing digits are 9
        // make trailing digits 0, increment prev ele
        count = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (answer.get(i) == 9) {
                count++;
            } else {
                break;
            }
        }

        for (int i = N - 1; i >= N - count; i--) {
            answer.set(i, 0);
        }
        int incrementIndex = N - count - 1;
        int element = answer.get(incrementIndex);
        answer.set(incrementIndex, ++element);

        return answer;
    }
}
