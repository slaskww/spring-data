package org.sda.springfull.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/international")
    public String getInternationalPage() {
        return "i18n";
    }
}
