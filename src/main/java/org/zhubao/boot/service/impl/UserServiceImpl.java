package org.zhubao.boot.service.impl;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.zhubao.boot.model.User;
import org.zhubao.boot.repository.UserRepository;
import org.zhubao.boot.service.UserService;
import org.zhubao.boot.service.base.BaseServiceImpl;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User, Integer> implements UserService {

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.setRepository(userRepository);
        this.userRepository = userRepository;
    }

    @Override
    @Cacheable(value = "userCache")
    public User findByUsername(String username) {
        logger.info("No cache here.");
        return userRepository.findByUsername(username);
    }

}
