package com.example.demo;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

/**
 * Created by dimomass on 28.10.18.
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping(method = RequestMethod.POST)
    public String test(@RequestBody(required = false) String event, HttpServletRequest request) {
        System.out.println("catch request " + event);
        return event;
    }
}
