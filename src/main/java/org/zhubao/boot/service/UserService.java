package org.zhubao.boot.service;

import org.zhubao.boot.model.User;
import org.zhubao.boot.service.base.BaseService;
import org.zhubao.boot.vo.ResponseVo;

public interface UserService extends BaseService<User, Integer> {

    /**
     * find user by name
     * @param username
     * @return
     */
    public User findByUsername(String username);

    /**
     * user login with username & password
     * @param username
     * @param password
     * @return
     */
    public ResponseVo<User> login(String username, String password);
}
