package com.study.spring.aop.service;

// 使用jdk动态代理  
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