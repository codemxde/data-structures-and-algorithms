package org.codemxde.live_classes.advanced_dsa_one.lecture_08_maths_modular_arithmetic_and_gcd.assignment.q1_implement_power_function;

public class Solution {

    public static void main(String[] args) {

    }

    // Calculate: (a ^ b) % m --> (a % m) ^ b
    // TODO: implement remaining function
    public static int pow(int a, int b, int m) {
        if (b == 0) return 1;

        long halfpower = pow(a, b / 2, m);

        if ((b & 1) == 1) {
            return (int) ( ( (halfpower % m) * (halfpower % m) * (a % m) ) % m );
        } else {
            return (int) (halfpower * halfpower);
        }
    }
}
