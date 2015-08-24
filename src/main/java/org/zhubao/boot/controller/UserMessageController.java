package org.zhubao.boot.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zhubao.boot.model.decorate.MessageStatus;
import org.zhubao.boot.service.UserMessageService;
import org.zhubao.boot.vo.UserMessageVo;
import org.zhubao.boot.vo.UserVo;

@Controller
public class UserMessageController {

    @Autowired
    private UserMessageService userMessageService;
    @RequestMapping(value = "/message/index", method = RequestMethod.GET)
    public String messagePage(HttpSession session, Model model) {
        UserVo user = (UserVo) session.getAttribute("user");
        System.out.println(user);
        List<UserMessageVo> messages = userMessageService.getUserMessageByFilter(user.getUserId(), MessageStatus.UNREAD);
        model.addAttribute("messages", messages);
        return "message/index";
    }
}
