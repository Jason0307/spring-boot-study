package org.zhubao.boot.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;
import org.zhubao.boot.Application;
import org.zhubao.boot.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebIntegrationTest
public class UserControllerTest {

    @Autowired
    private WebApplicationContext context;
    @Before
    public void setUp() {
    }
    
    @Test
    public void testFindByUsername() throws Exception{
        RestTemplate restTemplate = new TestRestTemplate();
        User response = restTemplate.getForObject("http://127.0.0.1:8080/platform/user/get/Jason", User.class);
        System.out.println(response);
    }
}
