package com.study.exception;

/**
 * ���� : \
 * ��Ȩ : Copyright-(c) 2017
 * ��˾ : Thinkive
 *
 * @author ���ӿ�
 * @version 2017-04-25 22:17
 */
public class TryTest {
    public static void main(String[] args) {
        System.out.println(test());
    }

    public static int test() {
        try {
            throw new Exception();
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }
}
