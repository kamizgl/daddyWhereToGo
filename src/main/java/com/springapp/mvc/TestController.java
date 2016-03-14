package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by pc01 on 2015/12/27.
 */@Controller
   @RequestMapping("/p")
public class TestController {

    @RequestMapping(value = "/h",method = RequestMethod.POST)
    @ResponseBody
    public String printWelcome(@RequestParam("data") String data) {
        return data;
    }
}
