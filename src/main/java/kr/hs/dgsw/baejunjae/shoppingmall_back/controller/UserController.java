package kr.hs.dgsw.baejunjae.shoppingmall_back.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping
    public String hello() {
        return "hello, world!";
    }
}
