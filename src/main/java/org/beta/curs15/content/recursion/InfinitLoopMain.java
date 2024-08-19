package org.beta.curs15.content.recursion;

public class InfinitLoopMain {
    public static long counter = 0;

    public static void main(String[] args) {
        doSomething();
    }

    private static void doSomething() {
        if (counter >= 3) {
            return;
        }
        System.out.println(++counter);
        doSomething();
    }
}
