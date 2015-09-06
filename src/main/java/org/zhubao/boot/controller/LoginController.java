package org.zhubao.boot.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zhubao.boot.service.UserService;
import org.zhubao.boot.vo.UserVo;
import org.zhubao.boot.vo.wapper.ResponseVo;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/login", method = RequestMethod.GET)
    public String loginPage(Model model) {
        return "login";
    }
    
    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public String doLogin(String username, String password, HttpSession session) {
        ResponseVo<UserVo> response = userService.login(username, password);
        session.setAttribute("user", response.getData());
        return "redirect:/main";
    }
    
    @RequestMapping(value = "/user/logout", method = RequestMethod.GET)
    public String logout(HttpSession session) {
        System.out.println(session.getAttribute("user"));
        session.removeAttribute("user");
        return "redirect:/main";
    }
}
