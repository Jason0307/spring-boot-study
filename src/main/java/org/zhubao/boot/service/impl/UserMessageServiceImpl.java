package org.zhubao.boot.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zhubao.boot.model.UserMessage;
import org.zhubao.boot.model.decorate.MessageStatus;
import org.zhubao.boot.repository.UserMessageRepository;
import org.zhubao.boot.service.UserMessageService;
import org.zhubao.boot.service.base.BaseServiceImpl;
import org.zhubao.boot.util.VoUtil;
import org.zhubao.boot.vo.UserMessageVo;
@Service
public class UserMessageServiceImpl extends BaseServiceImpl<UserMessage, Integer> implements UserMessageService{
    private Logger logger = LoggerFactory.getLogger(UserMessageServiceImpl.class);
    private UserMessageRepository userMessageRepository;

    @Autowired
    public void setUserMessageRepository(UserMessageRepository userMessageRepository) {
        this.setRepository(userMessageRepository);
        this.userMessageRepository = userMessageRepository;
    }
    @Override
    public List<UserMessageVo> getUserMessageByFilter(int userId, MessageStatus status) {
        logger.info("==== find user messages by filter ====");
        List<UserMessage> userMessages = userMessageRepository.findByToUserUserIdAndStatus(userId, status);
        List<UserMessageVo> messageVos = new ArrayList<UserMessageVo>();
        for(UserMessage message : userMessages) {
            UserMessageVo messageVo = VoUtil.convert(message);
            messageVos.add(messageVo);
        }
        return messageVos;
    }

    @Override
    public int countUserMessagesByFilter(int userId, MessageStatus status) {
        return userMessageRepository.countByToUserUserIdAndStatus(userId, status);
    }

}
