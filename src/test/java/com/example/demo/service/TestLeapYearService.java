package com.example.demo.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestLeapYearService {

    @Autowired
    private LeapYearService service;

    @Test
    public void test_400_divide() {
        assertTrue(this.service.check(2000));
    }

    @Test
    public void test_100_divide_400_not_divide() {
        assertFalse(this.service.check(2100));
    }

    @Test
    public void test_4_divide() {
        assertTrue(this.service.check(2012));
    }

    @Test
    public void test_4_not_divide() {
        assertFalse(this.service.check(2013));
    }


}
