package org.codemxde.recorded_lectures.utkarsh_gupta.advanced_dsa_one.arrays_3_interview_problems.in_class;

public class Main {

    public static void main(String[] args) {
        // Q1. Calculate the amount of rainwater trapped between buildings
        calculateRainwaterTrapped();
    }

    public static void calculateRainwaterTrapped() {
        System.out.println("Q1. Calculate the amount of rainwater trapped between buildings");
        int[] A = new int[] { 6, 4, 3, 5, 2, 4, 5 };

        // T.C - O(N), S.C - O(N)
        calculateUsingPrefixArray(A);
        // Further Optimised: T.C - O(N), S.C - O(1)
        calculateUsingCarryForward(A);

        printEndOfSegment();
    }

    public static void calculateUsingPrefixArray(int[] A) {
        // create leftMax and rightMax heights to understand boundaries
        int[] leftMax = createPrefixHeightsLeft(A);
        int[] rightMax = createPrefixHeightsRight(A);

        // calculate and add water trapped over each building
        int rainwaterTrapped = 0;
        for (int i = 1; i < A.length - 1; i++) {
            int waterAboveBuilding = Math.min(leftMax[i], rightMax[i]) - A[i];
            rainwaterTrapped += waterAboveBuilding;
        }

        // Console the answer
        System.out.println("Total Rainwater Trapped (prefix-array approach): " + rainwaterTrapped);
    }

    public static int[] createPrefixHeightsLeft(int[] A) {
        int[] leftMax = new int[A.length];
        int maxLeft = A[0]; leftMax[0] = maxLeft;

        for (int i = 1; i < A.length; i++) {
            if (A[i] > maxLeft) maxLeft = A[i];
            leftMax[i] = maxLeft;
        }

        return leftMax;
    }

    public static int[] createPrefixHeightsRight(int[] A) {
        int N = A.length;
        int[] rightMax = new int[N];
        int maxRight = A[N - 1]; rightMax[N - 1] = maxRight;

        for (int i = N - 2; i >= 0; i--) {
            if(A[i] > maxRight) maxRight = A[i];
            rightMax[i] = maxRight;
        }

        return rightMax;
    }

    public static void calculateUsingCarryForward(int[] A) {
        int N = A.length;
        int lmax = A[0], rmax = A[N - 1];
        int rainwaterTrapped = 0;
        int i = 0, j = N - 1;

        while (i < j) {
            if (lmax < rmax) {
                rainwaterTrapped += lmax - A[i];

                i++;
                lmax = Math.max(lmax, A[i]);
            } else {
                rainwaterTrapped += rmax - A[j];

                j--;
                rmax = Math.max(rmax, A[j]);
            }
        }

        System.out.println("Total Rainwater Trapped (carry-forward approach): " + rainwaterTrapped);
    }

    public static void printEndOfSegment() {
        System.out.println("==================================================");
    }
}
