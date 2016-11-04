package com.dyng.springboot.service.impl;

import com.dyng.springboot.service.NumberService;
import org.springframework.stereotype.Service;

/**
 * Created by dingye on 16/11/4.
 */
@Service
public class NumberServiceImpl implements NumberService {
    @Override
    public int max(int a, int b) {
        return a > b ? a : b;
    }
}
