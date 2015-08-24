package org.zhubao.boot.util;

import org.zhubao.boot.model.UserMessage;
import org.zhubao.boot.vo.UserMessageVo;


public class VoUtil {

    public static UserMessageVo convert(UserMessage message) {
        if(null != message) {
            UserMessageVo messageVo = new UserMessageVo();
            messageVo.setId(message.getId());
            messageVo.setContent(message.getContent());
            messageVo.setToUserId(message.getToUser().getUserId());
            messageVo.setFromUserId(message.getFromUser().getUserId());
            messageVo.setFromUsername(message.getFromUser().getNickname());
            messageVo.setDateCreated(DateUtil.convertDateToString(message.getDateCreated(), "yyyy-MM-dd HH:mm"));
            return messageVo;
        }
        return null;
    }

}
