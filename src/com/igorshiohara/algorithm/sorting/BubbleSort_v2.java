package com.igorshiohara.algorithm.sorting;

import java.util.Arrays;

/**
 * Created by igor on 07/03/17.
 */
public class BubbleSort_v2 {

    public static void main(String[] args) {

        int[] data = new int[] {3,8,1,2,9,5};

        boolean isSorted = false;
        int latest = data.length-1;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < latest; i++) {
                if (data[i] > data[i+1]) {
                    int tmp = data[i];
                    data[i] = data[i+1];
                    data[i+1] = tmp;
                    isSorted = false;
                }
            }
            latest--;
        }

        System.out.println("Sorted list: " + Arrays.toString(data));

    }
}
