package com.study.exception;

/**
 * 描述 : \
 * 版权 : Copyright-(c) 2017
 * 公司 : Thinkive
 *
 * @author 王嵊俊
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
