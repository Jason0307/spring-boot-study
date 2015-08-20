package org.zhubao.boot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.zhubao.boot.model.User;
import org.zhubao.boot.service.UserService;
import org.zhubao.boot.vo.ResponseVo;

@Controller
@SessionAttributes("user")
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/login", method = RequestMethod.GET)
    public String loginPage(Model model) {
        return "login";
    }
    
    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public String doLogin(String username, String password, Model model) {
        ResponseVo<User> response = userService.login(username, password);
        model.addAttribute("user", response.getData());
        return "redirect:/main";
    }
    
    @RequestMapping(value = "/user/logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request) {
        request.getSession().removeAttribute("user");
        return "redirect:/main";
    }
}
