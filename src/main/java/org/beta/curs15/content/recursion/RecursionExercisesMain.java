package org.beta.curs15.content.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecursionExercisesMain {
    public static Map<Long, Long> cache = new HashMap<>();
    public static List<Pair> customCache = new ArrayList<>();

    public static void main(String[] args) {
        //print all numbers from n to 0 using recursion
        //printRecursionNumbers(10);

        //sum of all numbers from n to 1
        //System.out.println(sumRecursionNumbers(5));

        // sirul lui fibonacci 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
        // find the n number in fibonacci-> fibonacci(9) -> 55

        System.out.println(fibonacci(5));
        System.out.println(fibonacciCache(120));
        System.out.println(fibonacciCustom(120));
    }

    private static long fibonacciCustom(long n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        Pair pair = getCustomCache(n);
        if (pair != null) {
            return pair.value();
        }

        long firstResult = fibonacciCache(n - 1);
        long secondResult = fibonacciCache(n - 2);
        long result = firstResult + secondResult;
        customCache.add(new Pair(n, result));
        return result;
    }

    private static Pair getCustomCache(long n) {
        for (Pair pair : customCache) {
            if (pair.key() == n) {
                return pair;
            }
        }
        return null;
    }

    private static long fibonacciCache(long n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        long firstResult = fibonacciCache(n - 1);
        long secondResult = fibonacciCache(n - 2);
        long result = firstResult + secondResult;
        cache.put(n, result);
        return result;
    }

    private static long fibonacci(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    private static int sumRecursionNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursionNumbers(n - 1);
    }

    private static void printRecursionNumbers(int n) {
        if (n < 0) {
            return;
        }
        System.out.println(n);

        printRecursionNumbers(n - 1);
    }
}
