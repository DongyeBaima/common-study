package com.study.sort;

import java.util.Arrays;

/**
 * 描述 : 希尔排序
 * 版权 : Copyright-(c) 2017
 * 公司 : Thinkive
 *
 * @author 王嵊俊
 * @version 2017-05-17 22:34
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] array = new int[20];

        for (int i = 19; i >= 0; i--) {
            array[i] = 20 - i;
        }

        shell_1(array);
        System.out.println();
        System.out.println(Arrays.toString(array));
    }

    public static void shell(int[] array) {
        int gap = array.length;
        while (true) {
            gap = gap / 3;
            gap = gap != 0 ? gap : 1;

            for (int i = 0; i < gap; i++) {
                for (int j = i; j < array.length; j += gap) {
                    int min = j;
                    for (int k = j + gap; k < array.length; k += gap) {
                        if (array[min] > array[k]) {
                            min = k;
                        }
                    }
                    if (min != j) {
                        int tem = array[j];
                        array[j] = array[min];
                        array[min] = tem;
                    }
                }
            }

            System.out.println("    gap : " + gap + "   " + Arrays.toString(array));

            if (gap == 1) {
                break;
            }
        }
    }

    public static void shell_1(int[] a) {
        int gap = 1, i, j, len = a.length;
        int temp;//插入排序交换值的暂存
        //确定初始步长
        while (gap < len / 3) {
            gap = gap * 3 + 1;
        }
        for (; gap > 0; gap /= 3) {//循环遍历步长，最后必为1
            for (i = gap; i < len; i++) {//每一列依次向前做插入排序
                temp = a[i];
                //每一列中在a[i]上面且比a[i]大的元素依次向下移动
                for (j = i - gap; j >= 0 && a[j] > temp; j -= gap) {
                    a[j + gap] = a[j];
                    System.out.println("    gap:" + gap + "     " + Arrays.toString(a));
                }
                //a[i]填补空白，完成一列中的依次插入排序
                a[j + gap] = temp;

                System.out.println("    gap:" + gap + "     " + Arrays.toString(a));

            }
        }
    }

}
