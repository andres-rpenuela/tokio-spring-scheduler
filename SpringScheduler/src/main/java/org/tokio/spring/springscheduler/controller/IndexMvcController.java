package org.tokio.spring.springscheduler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexMvcController {

    @GetMapping({"","/","/index"})
    public String indexHandler() {
        return "index";
    }
}
