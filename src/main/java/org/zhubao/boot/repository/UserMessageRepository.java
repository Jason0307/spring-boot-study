package org.zhubao.boot.repository;

import java.util.List;

import org.zhubao.boot.model.UserMessage;
import org.zhubao.boot.model.decorate.MessageStatus;
import org.zhubao.boot.repository.base.BaseRepository;

public interface UserMessageRepository extends BaseRepository<UserMessage, Integer> {

    public List<UserMessage> findByToUserUserIdAndStatus(int userId, MessageStatus status);
    
    public int countByToUserUserIdAndStatus(int userId, MessageStatus status);
}
