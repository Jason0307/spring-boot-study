package org.zhubao.boot.vo;

import java.io.Serializable;

import lombok.Data;
@Data
public class UserVo implements Serializable {
    private static final long serialVersionUID = 1L;
    private int userId;
    private String username;
    private int msgNum;
    
}
