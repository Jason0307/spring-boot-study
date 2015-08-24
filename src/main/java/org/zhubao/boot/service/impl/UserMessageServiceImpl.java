package org.zhubao.boot.service.impl;

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
@Service
public class UserMessageServiceImpl extends BaseServiceImpl<UserMessage, Integer> implements UserMessageService {

    private Logger logger = LoggerFactory.getLogger(UserMessageServiceImpl.class);
    private UserMessageRepository userMessageRepository;

    @Autowired
    public void setUserRepository(UserMessageRepository userMessageRepository) {
        this.setRepository(userMessageRepository);
        this.userMessageRepository = userMessageRepository;
    }

    @Override
    public List<UserMessage> getUserMessageByFilter(int userId, MessageStatus status) {
        return userMessageRepository.findByToUserUserIdAndStatus(userId, status);
    }

    @Override
    public int countUserMessageByFilter(int userId, MessageStatus status) {
        logger.info("==== count user unread messages. ====");
        return userMessageRepository.countByToUserUserIdAndStatus(userId, status);
    }

}
