package org.codemxde.live_classes.advanced_dsa_one.lecture_06_recursion.assignment.q1_simple_recursion;

public class Solve {

    public static int bar(int x, int y) {
        if (y == 0) return 0;
        return (x + bar(x, y - 1));
    }

    public static int foo(int x, int y) {
        if (y == 0) return 1;
        return bar(x, foo(x, y - 1));
    }

    public static void main(String[] args) {
        System.out.println(foo(3, 5));
        // O.P. : 3^5 = 3 * 3 * 3 * 3 * 3 = 243
    }
}
