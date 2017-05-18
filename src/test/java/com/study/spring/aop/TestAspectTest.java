package com.study.spring.aop;

import com.study.spring.aop.service.AServiceImpl;
import com.study.spring.aop.service.BServiceImpl;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by SHENG on 2017/4/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring-aop.xml")
public class TestAspectTest {

    @Autowired
    private AServiceImpl aService;

    @Autowired
    private BServiceImpl bService;

    @org.junit.Test
    public void doAfter() throws Exception {
        aService.barA();
        try {
            int foooo = aService.foooo();
        } catch (Exception e) {
            e.printStackTrace();
        }

        aService.foooo();
    }

    @org.junit.Test
    public void doAround() throws Exception {
    }

    @org.junit.Test
    public void doBefore() throws Exception {
    }

    @org.junit.Test
    public void doThrowing() throws Exception {
    }

}