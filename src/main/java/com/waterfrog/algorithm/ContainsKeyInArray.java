package com.waterfrog.algorithm;

/**
 * Created by wangwanru on 16/9/20.
 * 在给定的二维数组中，从左往右，从上往下值依次变大。然后给定一个数值，判断是否保函在此数组中。
 * 利用有序数据,从［0，arr[0].length-1］进行向左向下移动
 */
public class ContainsKeyInArray {

    private static int[][] array = {
            {1, 2, 8, 9},
            {2, 4, 9, 12},
            {4, 7, 10, 13},
            {6, 8, 11, 15}
    };

    public static boolean contains(int[][] array, int key) {
        int x = 0;
        int y = array[0].length - 1;
        System.out.println(x + "-----" + y);
        int value = array[x][y];
        while (value != key) {

            if (x >= array.length || y <= 0) {
                return false;
            }

            if (value > key) {
                y--;
            }
            if (value < key) {
                x++;
            }
            System.out.println(x + "-----" + y);
            value = array[x][y];
        }

        if (value == key) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(contains(array,5));
    }

}
