package com.waterfrog.algorithm;

import java.util.Arrays;

/**
 * Created by wangwanru on 16/9/26.
 * 快排序
 */
public class QuickSort {
    public static void partition(int[] array, int i, int j) {
        if (j <= i) {
            return;
        }
        int start = i;
        int end = j;
        int data = array[start];
        while (start < end) {
            //从右向左找小于基数的值
            while (start < end && array[end] >= data) {
                end--;
            }
            if (start < end) {
                array[start] = array[end];
                start++;
            }
            while (start < end && array[start] < data) {
                start++;
            }
            if (start < end) {
                array[end] = array[start];
                end--;
            }

        }
        array[start] = data;
        partition(array, i, start - 1);
        partition(array, end + 1, j);
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        partition(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
