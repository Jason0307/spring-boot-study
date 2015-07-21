package org.zhubao.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.zhubao.boot.model.Article;
import org.zhubao.boot.repository.base.BaseRepository;

public interface ArticleRepository extends BaseRepository<Article, Integer> {

    /**
     * find articles by user
     * @param userId
     * @return
     */
    
    //@Query("SELECT a FROM Article a INNER JOIN FETCH a.user WHERE a.user.userId = ?1")
    @EntityGraph(value = "Article.user", type = EntityGraphType.FETCH)
    public List<Article> findByUserUserId(int userId);
}
