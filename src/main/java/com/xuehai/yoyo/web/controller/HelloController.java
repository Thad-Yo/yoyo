package com.xuehai.yoyo.web.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @program: yoyo
 * @description:
 * @author: jiaxiaofei
 * @create: 2021-01-11 17:21
 **/
@RestController
public class HelloController {



    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }
}
