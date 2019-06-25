package kr.hs.dgsw.baejunjae.shoppingmall_back.controller;

import kr.hs.dgsw.baejunjae.shoppingmall_back.domain.User;
import kr.hs.dgsw.baejunjae.shoppingmall_back.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String hello() {
        return "hello, world!";
    }

    @PostMapping("/api/user/register")
    public Long register(@RequestBody User user) {
        return this.userService.register(user);
    }

    @PostMapping("/api/user/login")
    public User login(@RequestBody User user) {
        return this.userService.login(user);
    }
}
