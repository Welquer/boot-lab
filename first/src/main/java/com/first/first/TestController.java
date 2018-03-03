package com.first.first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/test")
public class TestController {

    @RequestMapping(method = RequestMethod.GET)
    public String greeting(@RequestParam(required=false) String name) {
        return "test";
    }
}
