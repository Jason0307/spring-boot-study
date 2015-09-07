package org.zhubao.boot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.zhubao.boot.Application;
import org.zhubao.boot.model.UserMessage;
import org.zhubao.boot.model.decorate.MessageStatus;
import org.zhubao.boot.repository.UserMessageRepository;

@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest
@TestExecutionListeners(inheritListeners = false, listeners = {
        DependencyInjectionTestExecutionListener.class,
        DirtiesContextTestExecutionListener.class })
public class UserMessageRepositoryTest extends AbstractTestNGSpringContextTests{

    @Autowired
    private UserMessageRepository userMessageRepository;
    
    
    @Test
    @Parameters({"userId", "status"})
    public void testFindByUserId (int userId, MessageStatus status) {
        System.out.println(status);
        List<UserMessage> messages = userMessageRepository.findByToUserUserIdAndStatus(userId, status);
        for (UserMessage message : messages) {
            System.out.println(message);
        }
        
        int msgNum = userMessageRepository.countByToUserUserIdAndStatus(userId, status);
        System.out.println(msgNum);
    }
}
