package org.zhubao.boot.service;

import org.zhubao.boot.model.User;
import org.zhubao.boot.service.base.BaseService;

public interface UserService extends BaseService<User, Integer> {

    /**
     * find user by name
     * @param username
     * @return
     */
    public User findByUsername(String username);
}
