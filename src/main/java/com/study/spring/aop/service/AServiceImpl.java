package com.study.spring.aop.service;

// ʹ��jdk��̬����  
public class AServiceImpl {

    public void barA() {
        System.out.println("AServiceImpl.barA()");
    }

    public void fooA(String _msg) {
        System.out.println("AServiceImpl.fooA(msg:" + _msg + ")");
        throw new RuntimeException();
    }

    public int foooo(){
        throw new RuntimeException();
    }
}  