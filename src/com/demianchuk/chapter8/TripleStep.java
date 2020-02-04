package com.demianchuk.chapter8;

import java.util.HashMap;
import java.util.Map;

public class TripleStep {

    private static Map<Integer, Integer> cache = new HashMap<>();

    public static void main(String[] args) {
        int n = 4;
        System.out.println(countWays(n));
    }

    public static int countWays(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        if (cache.containsKey(n)) return cache.get(n);
        int result = countWays(n - 1) + countWays(n - 2) + countWays(n - 3);
        cache.put(n, result);
        return result;
    }
}
