package org.zhubao.boot.vo;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserMessageVo implements Serializable{

    private static final long serialVersionUID = 1L;
    private int id;
    private String content;
    private int toUserId;
    private int fromUserId;
    private String fromUsername;
    private String dateCreated;
}
