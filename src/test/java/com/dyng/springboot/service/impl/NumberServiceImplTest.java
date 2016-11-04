package com.dyng.springboot.service.impl;

import com.dyng.springboot.Application;
import com.dyng.springboot.service.NumberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by dingye on 16/11/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Application.class)
public class NumberServiceImplTest {
    @Autowired
    private NumberService numberService;

    @Test
    public void max() throws Exception {
        assertThat(numberService.max(1, 2), is(2));
    }
}