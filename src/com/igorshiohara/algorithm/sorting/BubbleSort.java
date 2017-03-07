package com.igorshiohara.algorithm.sorting;

import java.util.Arrays;

/**
 * Created by igor on 07/03/17.
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] data = new int[] {3,8,1,2,9,5};

        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < data.length-1; i++) {
                if (data[i] > data[i+1]) {
                    int tmp = data[i];
                    data[i] = data[i+1];
                    data[i+1] = tmp;
                    isSorted = false;
                }
            }
        }

        System.out.println("Sorted list: " + Arrays.toString(data));

    }

}
