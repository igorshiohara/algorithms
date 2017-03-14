package com.igorshiohara.algorithms.search;

/**
 * Created by igor on 14/03/17.
 */
public class BinarySearchIterative {

    private static boolean binarySearchIterative(int[] values, int target) {
        int min = 0;
        int max = values.length - 1;
        int guess;

        while (min <= max) {
            guess = Math.round((max + min) / 2);

            if (values[guess] == target) {
                return true;
            }

            if ( values[guess] > target) {
                max = guess - 1;
            } else {
                min = guess + 1;
            }

        }
        return false;
    }


    public static void main(String[] args) {
        int target = 44;

        int[] data = new int[] { 3, 5, 7, 12, 15, 21, 44 , 65};

        boolean found = binarySearchIterative(data, target);
        System.out.println(found);

    }

}
