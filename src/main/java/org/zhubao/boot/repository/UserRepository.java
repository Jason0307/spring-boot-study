package org.zhubao.boot.repository;

import org.zhubao.boot.model.User;
import org.zhubao.boot.repository.base.BaseRepository;

public interface UserRepository extends BaseRepository<User, Integer> {

    /**
     * find user by name
     * @param username
     * @return
     */
    public User findByUsername(String username);
    
    /**
     * find user by emailAddress
     * @param emailAddress
     * @return
     */
    public User findOneByEmailAddress(String emailAddress);
}
