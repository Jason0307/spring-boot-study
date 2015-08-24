package org.zhubao.boot.repository;

import java.util.List;

import org.zhubao.boot.model.UserMessage;
import org.zhubao.boot.model.decorate.MessageStatus;
import org.zhubao.boot.repository.base.BaseRepository;

public interface UserMessageRepository extends BaseRepository<UserMessage, Integer> {

    /**
     * find user message by filter(Read or Unread)
     * @param userId
     * @param status
     * @return
     */
    public List<UserMessage> findByToUserUserIdAndStatus(int userId, MessageStatus status);
    
    /**
     * get the count of user message by filter(Read or Unread)
     * @param userId
     * @param status
     * @return
     */
    public int countByToUserUserIdAndStatus(int userId, MessageStatus status);
}
