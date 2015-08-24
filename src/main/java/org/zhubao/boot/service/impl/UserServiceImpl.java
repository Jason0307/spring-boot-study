package org.zhubao.boot.service.impl;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.zhubao.boot.model.User;
import org.zhubao.boot.model.decorate.MessageStatus;
import org.zhubao.boot.repository.UserRepository;
import org.zhubao.boot.service.UserMessageService;
import org.zhubao.boot.service.UserService;
import org.zhubao.boot.service.base.BaseServiceImpl;
import org.zhubao.boot.util.BootUtil;
import org.zhubao.boot.util.Constants;
import org.zhubao.boot.vo.UserVo;
import org.zhubao.boot.vo.wapper.MetaVo;
import org.zhubao.boot.vo.wapper.ResponseVo;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User, Integer> implements UserService {

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    private UserRepository userRepository;
    @Autowired
    private UserMessageService userMessageService;

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

    @Override
    public ResponseVo<UserVo> login(String username, String password) {
        ResponseVo<UserVo> response = new ResponseVo<UserVo>();
        User user = userRepository.findByUsername(username);
        if (null != user) {
            if (!StringUtils.isEmpty(password)) {
                if (BootUtil.isPasswordValid(username, password, user.getPassword())) {
                    int msgNum = userMessageService.countUserMessagesByFilter(user.getUserId(), MessageStatus.UNREAD);
                    UserVo userVo = new UserVo();
                    userVo.setUsername(user.getNickname());
                    userVo.setMsgNum(msgNum);
                    userVo.setUserId(user.getUserId());
                    response.setData(userVo);
                    return response;
                }
            }
        }
        
        MetaVo meta = response.getMeta();
        meta.setMessage(Constants.LOGIN_ERROR_MESSAGR);
        meta.setCode(Constants.LOGIN_ERROR_CODE);
        return null;
    }

}
