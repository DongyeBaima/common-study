package com.study.sort;

import java.util.Arrays;

/**
 * ���� : ϣ������
 * ��Ȩ : Copyright-(c) 2017
 * ��˾ : Thinkive
 *
 * @author ���ӿ�
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
        int temp;//�������򽻻�ֵ���ݴ�
        //ȷ����ʼ����
        while (gap < len / 3) {
            gap = gap * 3 + 1;
        }
        for (; gap > 0; gap /= 3) {//ѭ����������������Ϊ1
            for (i = gap; i < len; i++) {//ÿһ��������ǰ����������
                temp = a[i];
                //ÿһ������a[i]�����ұ�a[i]���Ԫ�����������ƶ�
                for (j = i - gap; j >= 0 && a[j] > temp; j -= gap) {
                    a[j + gap] = a[j];
                    System.out.println("    gap:" + gap + "     " + Arrays.toString(a));
                }
                //a[i]��հף����һ���е����β�������
                a[j + gap] = temp;

                System.out.println("    gap:" + gap + "     " + Arrays.toString(a));

            }
        }
    }

}
