package org.zhubao.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessageController {

    @RequestMapping("/message/index")
    public String messagePage() {
        return "message/index";
    }
}
