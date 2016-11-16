package io.coolguy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NiceController {

    @RequestMapping("/nice")
    @ResponseBody
    public String nice () {
        return "nice one cool guy";
    }
}
