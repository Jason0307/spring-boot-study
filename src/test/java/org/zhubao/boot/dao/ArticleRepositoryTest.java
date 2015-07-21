package org.zhubao.boot.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zhubao.boot.Application;
import org.zhubao.boot.model.Article;
import org.zhubao.boot.repository.ArticleRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class ArticleRepositoryTest {

    @Autowired
    private ArticleRepository articleRepository;
    
    
    @Test
    public void testFindByUserId () {
        List<Article> articles = articleRepository.findByUserUserId(1);
        for (Article article : articles) {
            System.out.println(article);
        }
        //Assert.assertEquals(1, articles.size());
    }
}
