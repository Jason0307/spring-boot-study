package org.zhubao.boot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zhubao.boot.model.User;
import org.zhubao.boot.service.UserService;
import org.zhubao.boot.vo.UserVo;
import org.zhubao.boot.vo.wapper.ResponseVo;

@Controller
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    @ResponseBody
    public Iterable<User> getUsers() {
        logger.info("Dispather server here.");
        return userService.findAll();
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public ResponseVo<UserVo> login(@RequestParam(value = "username", required = true) String username,
            @RequestParam(value = "password", required = true) String password) {
        logger.info("Dispather server here.");
        ResponseVo<UserVo> response = userService.login(username, password);
        return response;
    }

    @RequestMapping("/user/{id}")
    public String getUser(@PathVariable("id") int id, Model model) {
        User user = userService.findById(id);
        model.addAttribute("user", user);
        return "user";
    }
    
    @RequestMapping("/main")
    public String main(Model model) {
        Iterable<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "main";
    }

    @RequestMapping("/user/get/{username}")
    @ResponseBody
    public User getUser(@PathVariable("username") String username) {
        User user = userService.findByUsername(username);
        return user;
    }
}
