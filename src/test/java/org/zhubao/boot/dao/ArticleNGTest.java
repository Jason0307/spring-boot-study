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
import org.zhubao.boot.model.Article;
import org.zhubao.boot.repository.ArticleRepository;

@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest
@TestExecutionListeners(inheritListeners = false, listeners = {
        DependencyInjectionTestExecutionListener.class,
        DirtiesContextTestExecutionListener.class })
public class ArticleNGTest extends AbstractTestNGSpringContextTests{

    @Autowired
    private ArticleRepository articleRepository;
    
    
    @Test
    @Parameters("userId")
    public void testFindByUserId (int userId) {
        List<Article> articles = articleRepository.findByUserUserId(userId);
        for (Article article : articles) {
            System.out.println(article);
        }
    }
}
