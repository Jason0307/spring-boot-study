package org.zhubao.boot.service;

import java.util.List;

import org.zhubao.boot.model.UserMessage;
import org.zhubao.boot.model.decorate.MessageStatus;
import org.zhubao.boot.service.base.BaseService;
import org.zhubao.boot.vo.UserMessageVo;
public interface UserMessageService extends BaseService<UserMessage, Integer> {

    /**
     * get user messages by filter (READ, UNREAD)
     * @param userId
     * @param status
     * @return
     */
    public List<UserMessageVo> getUserMessageByFilter(int userId, MessageStatus status);
    
    /**
     * count user messages by filter(READ, UNREAD)
     * @param userId
     * @param status
     * @return
     */
    public int countUserMessagesByFilter(int userId, MessageStatus status);

}
