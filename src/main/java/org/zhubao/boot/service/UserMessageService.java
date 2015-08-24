package org.zhubao.boot.service;

import java.util.List;

import org.zhubao.boot.model.UserMessage;
import org.zhubao.boot.model.decorate.MessageStatus;
import org.zhubao.boot.service.base.BaseService;

public interface UserMessageService extends BaseService<UserMessage, Integer> {

    public List<UserMessage> getUserMessageByFilter(int userId, MessageStatus status);
    
    public int countUserMessageByFilter(int userId, MessageStatus status);
}
