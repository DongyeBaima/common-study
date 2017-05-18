package com.study.stacktraces;

/**
 * 描述 :
 * 版权 : Copyright-(c) 2017
 * 公司 : Thinkive
 *
 * @author 王嵊俊
 * @version 2017-04-19 23:01
 */
public class StatckTraces {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("        --------");
            e.printStackTrace();
        }
        System.out.println(" - -- - - -");
    }

    public static void printStackTrace(Class cls) {
        StackTraceElement[] elements = (new Throwable()).getStackTrace();

        StringBuffer buf = new StringBuffer();
        buf.append("Stack for " + cls.getName() + ":");
        for (int i = 0; i < elements.length; i++) {
            buf.append("\n    "
                    + elements[i].getClassName()
                    + "."
                    + elements[i].getMethodName()
                    + "("
                    + elements[i].getFileName()
                    + ":"
                    + elements[i].getLineNumber()
                    + ")");
        }
        System.out.println(buf.toString());
    }


}
