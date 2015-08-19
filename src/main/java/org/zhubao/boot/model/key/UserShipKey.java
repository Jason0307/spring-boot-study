package org.zhubao.boot.model.key;

import java.io.Serializable;

import javax.persistence.Transient;

import lombok.Data;

@Data
public class UserShipKey implements Serializable{
    @Transient
    private static final long serialVersionUID = 1L;
    private int userId;
    private int friendId;
}
