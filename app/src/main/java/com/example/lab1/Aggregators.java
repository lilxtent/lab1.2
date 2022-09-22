package com.example.lab1;

public class Aggregators {

    /**
     * Finds maximum value in array
     */
    public static int Max(int[] array) {
        int max = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > max)
                max = num;
        }

        return max;
    }

    /**
     * Finds minimum value in array
     */
    public static int Min(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < min)
                min = num;
        }

        return min;
    }
}
