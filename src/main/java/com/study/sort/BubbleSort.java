package com.study.sort;

import java.util.Arrays;

/**
 * ÃèÊö : Ã°ÅİÅÅĞò
 * °æÈ¨ : Copyright-(c) 2017
 * ¹«Ë¾ : Thinkive
 *
 * @author ÍõáÓ¿¡
 * @version 2017-05-17 21:41
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[]{5,4,3,2,1};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        int start = 0;
        int end = array.length;

        for (int i = end - 1; i >= 0; i--) {
            for (int j = 0; j < i ; j++) {
                if (array[j] > array[j + 1]) {
                    int tem = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tem;
                }
                System.out.println("     i : " + i + "  j :" + j + "    " + Arrays.toString(array));
            }
            System.out.println();
        }
    }


}
