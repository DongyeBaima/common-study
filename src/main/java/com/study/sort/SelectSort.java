package com.study.sort;

import java.util.Arrays;

/**
 * 描述 : 选择排序
 * 版权 : Copyright-(c) 2017
 * 公司 : Thinkive
 *
 * @author 王嵊俊
 * @version 2017-05-17 22:08
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 3, 2, 1};
        select(array);
        System.out.println();
        System.out.println(Arrays.toString(array));
    }

    public static void select(int[] array) {

        for (int index = 0; index < array.length; index++) {
            int minIndex = index;
            for (int j = index + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != index) {
                int tem = array[index];
                array[index] = array[minIndex];
                array[minIndex] = tem;
            }

            System.out.println("    index : " + index + "   " + Arrays.toString(array));
        }

    }
}
