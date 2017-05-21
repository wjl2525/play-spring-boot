package com.spring.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by jlwang on 5/20/17.
 */
@Controller
public class GreetingController {
    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="parameterKey") String parameterValue, Model model) {
        // get an user name from anywhere
        model.addAttribute("modelKey", parameterValue);
        return "greeting";
    }

    @RequestMapping("/hello")
    public String hello(@RequestParam(value="parameterKey", required=false, defaultValue="defaultParameterValue") String parameterValue, Model model) {
        // get an user name from anywhere
        model.addAttribute("another", parameterValue);
        return "hello";
    }


}
