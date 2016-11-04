package com.dyng.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by dingye on 16/11/4.
 */
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable("name") String name) {
        return "Hello, " + name + "!";
    }
}
