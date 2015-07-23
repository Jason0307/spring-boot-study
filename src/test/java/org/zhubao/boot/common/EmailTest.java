package org.zhubao.boot.common;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zhubao.boot.Application;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class EmailTest {

    @Autowired
    private JavaMailSender mailSender;

    @Test
    public void testSendEmail() throws Exception {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
        mimeMessageHelper.setFrom(new InternetAddress("18621926390@163.com"));
        mimeMessageHelper.setTo("baogee@vip.qq.com");
        mimeMessageHelper.setSubject("May Day");
        mimeMessageHelper.setText("You are not real happy.");
        mailSender.send(mimeMessage);
    }
}
