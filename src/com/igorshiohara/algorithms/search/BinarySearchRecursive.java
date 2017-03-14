package com.igorshiohara.algorithms.search;

/**
 * Created by igor on 14/03/17.
 */
public class BinarySearchRecursive {

    private static int doSearch(int[] values, int target, int min, int max) {

        if (min <= max) {
            return -1;
        }

        int avg = (min + max) / 2;

        if (values[avg] == target) {
            return target;
        }

        if (values[avg] < target) {
            return doSearch(values, target, avg + 1, max);
        } else {
            return doSearch(values, target, avg - 1, max);
        }

    }

    public static void main(String[] args) {
        int target = 45;

        int[] data = new int[] { 3, 5, 7, 12, 15, 21, 44 , 65};

        int min = 0;
        int max = data.length - 1;

        System.out.println(doSearch(data, target, min, max));
    }
}
